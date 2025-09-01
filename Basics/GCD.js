function findGcd(a,b){
while(a>0 && b>0){
    if(a>b){
       a = a%b;
    }

    else{
        b = b%a;
    }

    
}
if (a == 0) {
        return b;
    }

    return a; return b;
}



function main(){
var a = 15; var b = 20;
console.log(findGcd(a,b));
}

main();