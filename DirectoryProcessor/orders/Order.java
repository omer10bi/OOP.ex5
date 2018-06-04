package DirectoryProcessor.orders;

import java.io.File;
import java.util.Arrays;

public abstract class Order {


	/**
	 * sort an array of files
	 * @param files the files to order
	 * @return an ordered array of files
	 */
	public File[] sort(File[] files){
		if(files.length < 2){
			return files;
		}
		int pivotIndex = (files.length-1) / 2;
		File[] sorted1 = sort(Arrays.copyOfRange(files, 0, pivotIndex));
		File[] sorted2 = sort(Arrays.copyOfRange(files, pivotIndex+1, files.length-1));
		return merge(sorted1, sorted2);
	}

	/*
	get 2 pre-ordered arrays and unite them into a single, ordered array
	 */
	private File[] merge(File[] arrayA, File[] arrayB){
		File[] mergedArray = new File[arrayA.length+arrayB.length];
		int i=0;
		int j=0;
		int balance;
		while(i+j < mergedArray.length){
			if(i == arrayA.length-1){ // all of the elements from arrayA have been placed in the new array
				mergedArray[i+j] = arrayB[j];
				j++;
			}
			else if(j == arrayB.length-1){ // all of the elements from arrayB have been placed in the new
				// array
				mergedArray[i+j] = arrayA[i];
				i++;
			}
			else{
				balance = compareFiles(arrayA[i], arrayB[j]);
				if(balance < 0){ // element from arrayA is smaller
					mergedArray[i+j] = arrayA[i];
					i++;
				}
				else{ // element from arrayB is either smaller or equal to the arrayA element
					mergedArray[i+j] = arrayB[j];
					j++;
				}
			}
		}
		return mergedArray;
	}

	/*
	compare 2 files and decide which is bigger
	 */
	abstract int compareFiles(File file1, File file2);

}
