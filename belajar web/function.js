document
.getElementById("biodataForm")
.addEventListener("submit", function (event) {
    event.preventDefault();

    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;
    const alamat = document.getElementById("alamat").value;
    const sekolah = document.getElementById("sekolah").value;
    const password = document.getElementById("password").value;
    const repassword = document.getElementById("repassword").value;

    const nameOutput = document.getElementById("name-output");
    const emailOutput = document.getElementById("email-output");
    const alamatOutput = document.getElementById("alamat-output");
    const sekolahOutput = document.getElementById("sekolah-output");
    const passwordOutput = document.getElementById("password-output");
    const repasswordOutput = document.getElementById("repassword-output");

    const formData = {
    name: name,
    email: email,
    alamat: alamat,
    sekolah: sekolah,
    password: password,
    repassword: repassword,
    };

    nameOutput.innerHTML = name;
    emailOutput.innerHTML = email;
    alamatOutput.innerHTML = alamat;
    sekolahOutput.innerHTML = sekolah;
    passwordOutput.innerHTML = password;
    repasswordOutput.innerHTML = repassword;

    console.log("Data Diri ", formData);
    alert("berhasil submit", formData);
});