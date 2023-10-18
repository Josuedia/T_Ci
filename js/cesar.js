const desplazamiento1 = document.getElementById("desplazamiento");
const texto = document.getElementById("txtU");
const textocifrado = document.getElementById("cifrado");

//para el descifrado
const textodesc = document.getElementById("textodes");
const textodescifrado = document.getElementById("descifrado");
const desplazamiento2 = document.getElementById("desplazamiento2");

function cifrado() {
    const textoIngresado = texto.value;
    textocifrado.value = textoIngresado.split("").map(c => {
            let mayus = c === c.toUpperCase();
            let valorEntero = c.toLowerCase().charCodeAt(0);
            if (valorEntero >= 97 && valorEntero <= 122) {
                const valorDesplazamiento = parseInt(desplazamiento1.value);
                valorEntero = ((valorEntero - 97 + valorDesplazamiento) % 26) + 97;
            }
            let cifrado = String.fromCharCode(valorEntero);
            return mayus ? cifrado.toUpperCase() : cifrado;
        })
        .join("");
}
function descifrado() {
    const textoIngresado2 = textodesc.value;
    textodescifrado.value = textoIngresado2.split("").map(c => {
            let mayus = c === c.toUpperCase();
            let valorEntero2 = c.toLowerCase().charCodeAt(0);
            if (valorEntero2 >= 97 && valorEntero2 <= 122) {
                const valorDesplazamiento2 = parseInt(desplazamiento2.value);
                valorEntero2 = ((valorEntero2 - 97 - valorDesplazamiento2 + 26) % 26) + 97;
            }
            let descifrado = String.fromCharCode(valorEntero2);
            return mayus ? descifrado.toUpperCase() : descifrado;
        })
        .join("");
}

texto.addEventListener("input", cifrado);
desplazamiento1.addEventListener("input", cifrado);

textodesc.addEventListener("input", descifrado);
desplazamiento2.addEventListener("input", descifrado);