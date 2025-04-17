const readline = require('readline');
const somar = require('./somar');
const subtrair = require('./subtrair');
const multiplicar = require('./multiplicar');
const dividir = require('./dividir');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function calcular() {
    rl.question('Qual vai ser a operação? (+, -, * ou /): ', (operacao) => {
        if (operacao !== "+" && operacao !== "-" && operacao !== "*" && operacao !== "/") {
            console.log('Por favor, insira uma operação válida.');
            rl.close();
            return;
        }

        rl.question('Digite o primeiro número: ', (numero1) => {
            rl.question('Digite o segundo número: ', (numero2) => {
                const num1 = parseFloat(numero1);
                const num2 = parseFloat(numero2);

                if (isNaN(num1) || isNaN(num2)) {
                    console.log('Por favor, insira números válidos.');
                    rl.close();
                    return;
                }

                let resultado;
                switch (operacao) {
                    case '+':
                        resultado = somar(num1, num2);
                        console.log(`O resultado da soma é: ${resultado}`);
                        break;
                    case '-':
                        if (num2 > num1) {
                            resultado = subtrair(num2, num1);
                        } else {
                            resultado = subtrair(num1, num2);
                        }
                        console.log(`O resultado da subtração é: ${resultado}`);
                        break;
                    case '*':
                        resultado = multiplicar(num1, num2);
                        console.log(`O resultado da multiplicação é: ${resultado}`);
                        break;
                    case '/':
                        resultado = dividir(num1, num2);
                        console.log(`O resultado da divisão é: ${resultado}`);
                        break;
                    default:
                        console.log('Operação inválida.');
                        break;
                }

                rl.close();
            });
        });
    });
}

calcular();