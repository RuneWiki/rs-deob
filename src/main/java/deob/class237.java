package deob;

@ObfuscatedName("ik")
public class class237 extends class219 {

    @ObfuscatedName("ik.o")
    public final int field2774;

    @ObfuscatedName("ik.k")
    public final int field2773;

    @ObfuscatedName("ik.t")
    public final int[] field2772;

    @ObfuscatedName("ik.d")
    public final int[] field2775;

    public class237(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2774 = arg0;
        this.field2773 = arg1;
        this.field2772 = arg2;
        this.field2775 = arg3;
    }

    @ObfuscatedName("ik.o(IIB)Z")
    public boolean method3985(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2775.length) {
            int var3 = this.field2775[arg1];
            if (arg0 >= var3 && arg0 <= this.field2772[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
