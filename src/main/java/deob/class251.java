package deob;

import java.util.LinkedList;

@ObfuscatedName("jo")
public abstract class class251 {

    @ObfuscatedName("jo.ar")
    public int field2623;

    @ObfuscatedName("jo.as")
    public int field2617;

    @ObfuscatedName("jo.aa")
    public int field2616;

    @ObfuscatedName("jo.az")
    public int field2632;

    @ObfuscatedName("jo.ao")
    public int field2620;

    @ObfuscatedName("jo.au")
    public int field2621;

    @ObfuscatedName("jo.ak")
    public int field2622 = -1;

    @ObfuscatedName("jo.ah")
    public int field2618 = -1;

    @ObfuscatedName("jo.aj")
    public short[][][] field2630;

    @ObfuscatedName("jo.af")
    public short[][][] field2619;

    @ObfuscatedName("jo.ax")
    public byte[][][] field2624;

    @ObfuscatedName("jo.an")
    public byte[][][] field2627;

    @ObfuscatedName("jo.ag")
    public class253[][][][] field2628;

    @ObfuscatedName("jo.am")
    public boolean field2629;

    @ObfuscatedName("jo.ad")
    public boolean field2625;

    public class251() {
        new LinkedList();
        this.field2629 = false;
        this.field2625 = false;
    }

    @ObfuscatedName("jo.ac(I)Z")
    public boolean method4529() {
        return this.field2629 && this.field2625;
    }

    @ObfuscatedName("jo.ab(Lof;I)V")
    public void method4546(class378 arg0) {
        if (this.method4529()) {
            return;
        }
        byte[] var2 = arg0.method6489(this.field2622, this.field2618);
        if (var2 != null) {
            this.method4188(new class534(var2));
            this.field2629 = true;
            this.field2625 = true;
        }
    }

    @ObfuscatedName("jo.av(I)V")
    public void method4540() {
        this.field2630 = (short[][][]) null;
        this.field2619 = (short[][][]) null;
        this.field2624 = (byte[][][]) null;
        this.field2627 = (byte[][][]) null;
        this.field2628 = (class253[][][][]) null;
        this.field2629 = false;
        this.field2625 = false;
    }

    @ObfuscatedName("jo.ap(IILuq;I)V")
    public void method4531(int arg0, int arg1, class534 arg2) {
        int var4 = arg2.method8591();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method4533(arg0, arg1, arg2, var4);
        } else {
            this.method4532(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("jo.bu(IILuq;II)V")
    public void method4532(int arg0, int arg1, class534 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field2619[0][arg0][arg1] = (short) arg2.method8593();
        }
        this.field2630[0][arg0][arg1] = (short) arg2.method8593();
    }

    @ObfuscatedName("jo.bo(IILuq;II)V")
    public void method4533(int arg0, int arg1, class534 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field2630[0][arg0][arg1] = (short) arg2.method8593();
        if (var6) {
            int var8 = arg2.method8591();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method8593();
                if (var10 != 0) {
                    this.field2619[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method8591();
                    this.field2624[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field2627[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method8591();
            if (var13 != 0) {
                class253[] var14 = this.field2628[var12][arg0][arg1] = new class253[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method8811();
                    int var17 = arg2.method8591();
                    var14[var15] = new class253(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("jo.bd(S)I")
    public int method4535() {
        return this.field2616;
    }

    @ObfuscatedName("jo.bi(I)I")
    public int method4536() {
        return this.field2632;
    }

    @ObfuscatedName("jo.aw(Luq;I)V")
    public abstract void method4188(class534 arg0);
}
