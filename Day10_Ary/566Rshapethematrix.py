def matrixReshape(mat: list[list[int]], r: int, c: int) -> list[list[int]]:
        flatten = []
        new_mat = []

        for row in mat:
            for num in row:
                flatten.append(num)
                
        if r * c != len(flatten):   # when given parameters is NOT possible and legal
            return mat
        else:
            for row_index in range(r):
                new_mat.append(flatten[row_index * c : row_index * c + c])
            return new_mat
        
mat = [[1,2],[3,4]] 
r = 1
c = 4

print(matrixReshape(mat,r,c))
        
'''Given a matrix mat of 3 rows * 4 columns,
we want reshape it into 2 rows (r = 2) * 6 columns(c = 6):

[[0,  1,  2,  3],
 [4,  5,  6,  7],                 ->                [[0,  1,  2,  3,  4,  5],
 [8,  9,  10, 11]]                                   [6,  7,  8,  9,  10, 11]]
Step 1: Flatten the given matrix mat to a 1-D list flatten for easier visualizations and calculations for future steps

flatten = [0,  1,  2,  3,  4,  5,  6,  7,  8,  9,  10, 11]

Step 2: Check whether the total number of given elements len(flatten) and the new shape r * c matches (i.e. whether "given parameters is possible and legal")

r = 2, c = 6
r * c = 12

Step 3: Rearrange all elements in 1-D list flatten into the new_mat according to given number of row r and given number of columns c

flatten = [0,  1,  2,  3,  4,  5,  6,  7,  8,  9,  10, 11]
reshaping:

                         [0,  1,  2,  3,  4,  5,   6,  7,  8,  9,  10, 11]
row_index: 0			| c0  c1  c2  c3  c4  c5 |
row_index: 1                           			 | c0  c1  c2  c3  c4  c5 |

index in flatten:  [row_index * c : row_index * c + c])

			            [0*6       :      0*6 + 6],  
										         [1*6        :       1*6+6]
												 
                        [0          :           6],  
										         [6          :          12]
iteration 0: row_index 0
flatten[0 : 6]   ->   [0,  1,  2,  3,  4,  5]

appending:
new_mat = [[0,  1,  2,  3,  4,  5]]
iteration 1: row_index 1
flatten[6 : 12]   ->   [6,  7,  8,  9,  10, 11]

appending:
new_mat = [[0,  1,  2,  3,  4,  5],
           [6,  7,  8,  9,  10, 11]]
'''