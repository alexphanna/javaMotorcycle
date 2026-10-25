/**

 * Project: Lab 1.5
 * Purpose Details: Frame for Motorcycle
 * Course: CMPSC 221
 * Author: Alex Hanna
 * Date Developed: 10/23/2026
 * Last Date Changed: 10/23/2026
 * Rev: 1

 */

class Frame {
    private Material material;
    public Frame(Material material) {
        this.material = material;
    }
    public void setMaterial(Material material) {
        this.material = material;
    }
    public Material getMaterial() {
        return material;
    }
}