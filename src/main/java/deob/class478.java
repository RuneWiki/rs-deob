package deob;

@ObfuscatedName("sv")
public class class478 implements class68 {

    @ObfuscatedName("sv.ab")
    public int field4949 = 0;

    @ObfuscatedName("sv.ay")
    public int field4945 = 0;

    @ObfuscatedName("sv.an")
    public int field4946 = 2;

    @ObfuscatedName("sv.au")
    public int field4956 = 0;

    @ObfuscatedName("sv.ax")
    public int field4948 = -1;

    @ObfuscatedName("sv.ao")
    public int field4954 = -1;

    @ObfuscatedName("sv.am")
    public int field4950 = -1;

    @ObfuscatedName("sv.ac")
    public int field4951 = 0;

    @ObfuscatedName("sv.ae")
    public class102 field4947;

    @ObfuscatedName("sv.ad")
    public int field4953 = 0;

    @ObfuscatedName("sv.aq")
    public int[] field4952 = new int[10];

    @ObfuscatedName("sv.al")
    public int[] field4955 = new int[10];

    @ObfuscatedName("sv.aj")
    public class275[] field4944 = new class275[10];

    public class478(int arg0, int arg1, int arg2, int arg3, class174 arg4) {
        this.field4947 = new class102(arg0, arg1, arg2, arg3, arg4);
    }

    @ObfuscatedName("sv.ae(B)V")
    public void method8047() {
        this.field4947.field1328.field2008 = this.field4947.field1308;
    }

    @ObfuscatedName("sv.ab(I)I")
    public int method1152() {
        return this.field4948;
    }

    @ObfuscatedName("sv.ay(B)I")
    public int method1156() {
        return this.field4950;
    }

    @ObfuscatedName("sv.an(I)I")
    public int method1151() {
        return this.field4949;
    }

    @ObfuscatedName("sv.ad(IILko;I)V")
    public final void method8049(int arg0, int arg1, class275 arg2) {
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method8055(arg0, arg1);
        } else if (this.field4952[0] >= 0 && this.field4952[0] < 104 && this.field4955[0] >= 0 && this.field4955[0] < 104) {
            this.method8051(arg0, arg1, arg2);
        } else {
            this.method8055(arg0, arg1);
        }
    }

    @ObfuscatedName("sv.aq(III)V")
    public void method8055(int arg0, int arg1) {
        this.field4953 = 0;
        this.field4952[0] = arg0;
        this.field4955[0] = arg1;
        byte var3 = 1;
        this.field4948 = this.field4952[0] * 128 + var3 * 64;
        this.field4950 = this.field4955[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("sv.al(IILko;S)V")
    public final void method8051(int arg0, int arg1, class275 arg2) {
        if (this.field4953 < 9) {
            this.field4953++;
        }
        for (int var4 = this.field4953; var4 > 0; var4--) {
            this.field4952[var4] = this.field4952[var4 - 1];
            this.field4955[var4] = this.field4955[var4 - 1];
            this.field4944[var4] = this.field4944[var4 - 1];
        }
        this.field4952[0] = arg0;
        this.field4955[0] = arg1;
        this.field4944[0] = arg2;
    }

    @ObfuscatedName("sv.aj(B)V")
    public final void method8046() {
        int var1 = this.field4945 - this.field4951 & 0x7FF;
        if (var1 != 0) {
            boolean var2 = true;
            boolean var3 = true;
            int var4 = var1 > 1024 ? -1 : 1;
            this.field4951 += (this.field4956 > 0 ? this.field4946 + 1 : this.field4946) * var4;
            this.field4956--;
            if (var1 < this.field4946 || var1 > 2048 - this.field4946) {
                this.field4951 = this.field4945;
            }
            this.field4951 &= 0x7FF;
        }
        if (this.field4953 == 0) {
            this.method8055(this.field4952[0], this.field4955[0]);
            return;
        }
        int var5 = this.field4948;
        int var6 = this.field4950;
        byte var7 = 1;
        int var8 = var7 * 128 / 2 + this.field4952[this.field4953 - 1] * 128;
        int var9 = var7 * 128 / 2 + this.field4955[this.field4953 - 1] * 128;
        class275 var10 = this.field4944[this.field4953 - 1];
        int var11 = (int) (Math.ceil((double) var10.field2990) * 128.0D);
        if (var8 - var5 > var11 || var8 - var5 < -var11 || var9 - var6 > var11 || var9 - var6 < -var11) {
            this.field4948 = var8;
            this.field4950 = var9;
            this.field4953--;
            return;
        }
        byte var12 = 4;
        if (this.field4953 > 2) {
            var12 = 6;
        }
        if (this.field4953 > 3) {
            var12 = 8;
        }
        int var13 = (int) ((float) var12 * var10.field2990);
        if (var5 != var8 || var6 != var9) {
            if (var5 < var8) {
                this.field4948 += var13;
                if (this.field4948 > var8) {
                    this.field4948 = var8;
                }
            } else if (var5 > var8) {
                this.field4948 -= var13;
                if (this.field4948 < var8) {
                    this.field4948 = var8;
                }
            }
            if (var6 < var9) {
                this.field4950 += var13;
                if (this.field4950 > var9) {
                    this.field4950 = var9;
                }
            } else if (var6 > var9) {
                this.field4950 -= var13;
                if (this.field4950 < var9) {
                    this.field4950 = var9;
                }
            }
        }
        if (this.field4948 == var8 && this.field4950 == var9) {
            this.field4953--;
        }
    }
}
