/*
Algorithm : isSorted(int[] givenArray)

Step 1: start
Step 2: declare boolean response = true;
Step 3: for i = 0 to givenArray.length - 1
step 4: if(givenArray[i] > givenArray[i+1]) then,
	set response to false and break the loop.
step 5: return response.
step 6: stop

 */
public class CheckSorting {
    public boolean isSorted(int[] givenArray){
        //step 2
        boolean response = true;
        //step 3
        for (int i = 0; i < givenArray.length - 1; i++) {
            //step 4
            if(givenArray[i] > givenArray[i+1]){
                response = false;
                break;
            }
        }
        //step 5
        return response;
    }

    public static void main(String[] args) {
        int[] givenArray = {6,8,18,95,185,500,642,2,649};
        CheckSorting checkSorting = new CheckSorting();
        boolean result = checkSorting.isSorted(givenArray);
        if (result){
            System.out.println("sorted");
        }else {
            System.out.println("un sorted");
        }
    }
}
