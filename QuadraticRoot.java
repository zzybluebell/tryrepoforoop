// QuadraticRoot class.
// Fill in the parts that are marked "WRITE YOUR CODE HERE."

import java.util.*;

public class QuadraticRoot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Finding the larger root of quadratic equation");
        System.out.println("Ax^2 + Bx + C = 0.");
        System.out.println("Enter coefficients A, B and C: ");
        
        // Read the three coefficients from the input.
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        
        double bigRoot;
        
        // Call findBigRoot() method to compute the larger root of the
        // quadratic equation. 
        // If findBigRoot() throws a IllegalArgumentException, then
        // print the error message "Cannot find root.", and in the next
        // line print the message in the exception and terminate program.
                
        // =======================
        // WRITE YOUR CODE HERE.
        // =======================
        
        // Print out the larger root in 3 decimal places.
        System.out.printf("The larger root is %.3f.\n", bigRoot);
       
    } // main
    
    // Compute and return the larger of the roots of the quadratic equation 
    // Ax^2 + Bx + C = 0.
    // If A == 0.0, then throw a IllegalArgumentException with the message
    // "findBigRoot(): Coefficient A is zero."
    // If discriminant < 0.0, then throw a IllegalArgumentException with the message
    // "findBigRoot(): Discriminant is negative."
    //
    // Recall that the larger of the roots is computed as
    // (-B + sqrt(discriminant)) / (2*A)
    // where discriminant = B*B - 4*A*C.
    
    public static double findBigRoot(double A, double B, double C)
        
        // =======================
        // WRITE YOUR CODE HERE.
        // =======================
        
    } // findBigRoot
    
} // class QuadraticRoot

