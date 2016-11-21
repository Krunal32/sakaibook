public class GradebookOps
{
	public static int findStudent(String studentName, String[] allStudentNames, boolean alphabetical)
	{
		for(int i=0;i<allStudentNames.length; i++){
			if (allStudentNames[i].equals(studentName))
				return i;
		}
		
		return -1;
	}

	public static double computeGrade(int studentIndex, int[][] scoreTable, int[] itemPointValues){
		double sum=0; 
		double total=0;
			for(int s=0;s<scoreTable[studentIndex].length;s++){
				for(int p=0;p<itemPointValues.length;p++){
					if(scoreTable[studentIndex][s]==-1){
						continue;					
														}
					sum = sum + scoreTable[studentIndex][s];
					total = total + itemPointValues[p];
														}
															}			
						double grade = (sum/total) * 100;			
			
					return grade; // replace this line with your code
																								}
	
	public static double[] computeAllGrades(int[][] scoreTable, int[] itemPointValues){
		
		double gradesClass[] = new double[scoreTable.length];
		
			for(int i=0;i<scoreTable.length;i++){
				double fin=0;
				double sm=0;
					for (int j=0;j<scoreTable[i].length;j++){
							if(scoreTable[i][j]==-1){
								continue;
													}
							fin=fin+scoreTable[i][j];
							sm=sm+itemPointValues[j];
							gradesClass[i]=(fin/sm)*100;
															}
												}
			return gradesClass; // replace this line with your code
																					}

	public static double computeClassAverage(int item, int[][] scoreTable){
		double sum=0;
		double counter=0;
		
			for(int i=0;i<scoreTable.length;i++){
				if(scoreTable[i][item]==-1){
					continue;
											}
					sum=sum+scoreTable[i][item];
					counter=counter+1;
				
												}
				double classAverage = sum/counter;	
		
		return classAverage; // replace this line with your code
	}
	


}