def rotate_matrix(matrix):
  for r in range(len(matrix)):
    for c in range(r+1, len(matrix)):
      matrix[r][c], matrix[c][r] = matrix[c][r], matrix[r][c]
    matrix[r].reverse()
  for r in matrix:
    return r
