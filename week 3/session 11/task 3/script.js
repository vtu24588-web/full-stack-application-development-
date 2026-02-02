const priceRange = document.getElementById("priceRange");
const priceValue = document.getElementById("priceValue");
const ratingFilter = document.getElementById("ratingFilter");
const products = document.querySelectorAll(".product");

let selectedColor = null;

priceRange.addEventListener("input", () => {
    priceValue.textContent = priceRange.value;
    filterProducts();
});

ratingFilter.addEventListener("change", filterProducts);

document.querySelectorAll(".color").forEach(btn => {
    btn.addEventListener("click", () => {
        selectedColor = btn.dataset.color;
        filterProducts();
    });
});

document.querySelectorAll(".filters input[type='checkbox']").forEach(cb => {
    cb.addEventListener("change", filterProducts);
});

function filterProducts() {
    const maxPrice = priceRange.value;
    const rating = ratingFilter.value;

    const brands = [...document.querySelectorAll(".filters input:checked")]
        .map(cb => cb.value);

    products.forEach(product => {
        const price = product.dataset.price;
        const brand = product.dataset.brand;
        const color = product.dataset.color;
        const productRating = product.dataset.rating;

        let visible = true;

        if (price > maxPrice) visible = false;
        if (brands.length && !brands.includes(brand)) visible = false;
        if (selectedColor && selectedColor !== color) visible = false;
        if (rating > productRating) visible = false;

        product.style.display = visible ? "block" : "none";
    });
}
