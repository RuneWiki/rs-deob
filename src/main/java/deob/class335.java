package deob;

@ObfuscatedName("mq")
public class class335 extends class485 {

    @ObfuscatedName("mq.am")
    public final int field3594;

    @ObfuscatedName("mq.ap")
    public final int field3593;

    @ObfuscatedName("mq.af")
    public final int[] field3592;

    @ObfuscatedName("mq.aj")
    public final int[] field3595;

    public class335(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field3594 = arg0;
        this.field3593 = arg1;
        this.field3592 = arg2;
        this.field3595 = arg3;
    }

    @ObfuscatedName("mq.am(III)Z")
    public boolean method5709(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field3595.length) {
            int var3 = this.field3595[arg1];
            if (arg0 >= var3 && arg0 <= this.field3592[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
