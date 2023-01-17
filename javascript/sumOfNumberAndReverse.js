function reverseString(str) {
    var splitString = str.split("");
    var reverseArray = splitString.reverse(); 
    var joinArray = reverseArray.join("");
    return joinArray; 
}

function sumOfNumberAndReverse(num) {
    var check = 0;
    if(num>0){
        for(var i=0;i<=num;i++){
            var re = i.toString()
            var re0 = reverseString(re)
            var re1 = parseInt(re0)
            if( i + re1 == num){
                console.log(re1 + "+"  + i  +"=" +num)
                check = 1;
                return true
            }
        }
        if(check == 0){
            return false
        }
    }else{
        return "try positive number please";

    }
    
};
console.log(sumOfNumberAndReverse(0));
