
echo "Enter the real part of the first complex number:"
read a1
echo "Enter the imaginary part of the first complex number:"
read b1

echo "Enter the real part of the second complex number:"
read a2
echo "Enter the imaginary part of the second complex number:"
read b2

r= (($a1 + $a2))

i= (($b1 + $b2))

echo "Sum of the complex numbers is: $r + i$i"
