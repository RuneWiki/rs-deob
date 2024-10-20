package deob;

@ObfuscatedName("ek")
public class class146 extends class130 {

    @ObfuscatedName("ek.n")
    public final int field2029;

    @ObfuscatedName("ek.d")
    public final int field2021;

    @ObfuscatedName("ek.m")
    public final int[] field2023;

    @ObfuscatedName("ek.h")
    public final int[] field2024;

    public class146(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2029 = arg0;
        this.field2021 = arg1;
        this.field2023 = arg2;
        this.field2024 = arg3;
    }

    @ObfuscatedName("ek.n(III)Z")
    public boolean method2574(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2024.length) {
            int var3 = this.field2024[arg1];
            if (arg0 >= var3 && arg0 <= this.field2023[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
