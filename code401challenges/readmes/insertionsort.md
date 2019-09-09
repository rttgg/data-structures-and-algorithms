  Pseudo Code
  
  InsertionSort(int[] arr)
  
    FOR i = 1 to arr.length
    
      int j <-- i - 1
      int temp <-- arr[i]
      
      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1
        
      arr[j + 1] <-- temp
# Challenge Summary
* Complete a working, tested implementation of insertion sort, based on the pseudo code provided.
* Create a blog post on understanding the Insertion Sort Algorithm suitable for a 301 level student. 
    Alternately, prepare a presentation that presents the algorithm in a novel way. 
    E.g. a short skit, live mini-lecture, interpretive dance.
  
* Reference 
  https://www.geeksforgeeks.org/insertion-sort/
