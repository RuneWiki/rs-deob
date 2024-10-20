package deob;

@ObfuscatedName("st")
public class class476 implements class68 {

    @ObfuscatedName("st.ak")
    public int field4949 = 0;

    @ObfuscatedName("st.al")
    public int field4941 = 0;

    @ObfuscatedName("st.aj")
    public int field4942 = 2;

    @ObfuscatedName("st.az")
    public int field4945 = 0;

    @ObfuscatedName("st.af")
    public int field4944 = -1;

    @ObfuscatedName("st.aa")
    public int field4947 = -1;

    @ObfuscatedName("st.at")
    public int field4946 = -1;

    @ObfuscatedName("st.ab")
    public int field4940 = 0;

    @ObfuscatedName("st.ac")
    public class102 field4948;

    @ObfuscatedName("st.ao")
    public int field4950 = 0;

    @ObfuscatedName("st.ah")
    public int[] field4943 = new int[10];

    @ObfuscatedName("st.av")
    public int[] field4951 = new int[10];

    @ObfuscatedName("st.aq")
    public class238[] field4952 = new class238[10];

    public class476(int arg0, int arg1, int arg2, int arg3) {
        this.field4948 = new class102(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("st.ah(B)V")
    public void method8002() {
        this.field4948.field1332.field2747 = this.field4948.field1349;
    }

    @ObfuscatedName("st.ak(I)I")
    public int method1154() {
        return this.field4944;
    }

    @ObfuscatedName("st.al(I)I")
    public int method1146() {
        return this.field4946;
    }

    @ObfuscatedName("st.aj(B)I")
    public int method1148() {
        return this.field4949;
    }

    @ObfuscatedName("st.av(IILjv;I)V")
    public final void method8003(int arg0, int arg1, class238 arg2) {
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method8004(arg0, arg1);
        } else if (this.field4943[0] >= 0 && this.field4943[0] < 104 && this.field4951[0] >= 0 && this.field4951[0] < 104) {
            this.method8005(arg0, arg1, arg2);
        } else {
            this.method8004(arg0, arg1);
        }
    }

    @ObfuscatedName("st.aq(III)V")
    public void method8004(int arg0, int arg1) {
        this.field4950 = 0;
        this.field4943[0] = arg0;
        this.field4951[0] = arg1;
        byte var3 = 1;
        this.field4944 = this.field4943[0] * 128 + var3 * 64;
        this.field4946 = this.field4951[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("st.ap(IILjv;I)V")
    public final void method8005(int arg0, int arg1, class238 arg2) {
        if (this.field4950 < 9) {
            this.field4950++;
        }
        for (int var4 = this.field4950; var4 > 0; var4--) {
            this.field4943[var4] = this.field4943[var4 - 1];
            this.field4951[var4] = this.field4951[var4 - 1];
            this.field4952[var4] = this.field4952[var4 - 1];
        }
        this.field4943[0] = arg0;
        this.field4951[0] = arg1;
        this.field4952[0] = arg2;
    }

    @ObfuscatedName("st.ae(I)V")
    public final void method7999() {
        int var1 = this.field4941 - this.field4940 & 0x7FF;
        if (var1 != 0) {
            boolean var2 = true;
            boolean var3 = true;
            int var4 = var1 > 1024 ? -1 : 1;
            this.field4940 += (this.field4945 > 0 ? this.field4942 + 1 : this.field4942) * var4;
            this.field4945--;
            if (var1 < this.field4942 || var1 > 2048 - this.field4942) {
                this.field4940 = this.field4941;
            }
            this.field4940 &= 0x7FF;
        }
        if (this.field4950 == 0) {
            this.method8004(this.field4943[0], this.field4951[0]);
            return;
        }
        int var5 = this.field4944;
        int var6 = this.field4946;
        byte var7 = 1;
        int var8 = this.field4943[this.field4950 - 1] * 128 + var7 * 64;
        int var9 = this.field4951[this.field4950 - 1] * 128 + var7 * 64;
        class238 var10 = this.field4952[this.field4950 - 1];
        int var11 = (int) (Math.ceil((double) var10.field2528) * 128.0D);
        if (var8 - var5 > var11 || var8 - var5 < -var11 || var9 - var6 > var11 || var9 - var6 < -var11) {
            this.field4944 = var8;
            this.field4946 = var9;
            this.field4950--;
            return;
        }
        byte var12 = 4;
        if (this.field4950 > 2) {
            var12 = 6;
        }
        if (this.field4950 > 3) {
            var12 = 8;
        }
        int var13 = (int) ((float) var12 * var10.field2528);
        if (var5 != var8 || var6 != var9) {
            if (var5 < var8) {
                this.field4944 += var13;
                if (this.field4944 > var8) {
                    this.field4944 = var8;
                }
            } else if (var5 > var8) {
                this.field4944 -= var13;
                if (this.field4944 < var8) {
                    this.field4944 = var8;
                }
            }
            if (var6 < var9) {
                this.field4946 += var13;
                if (this.field4946 > var9) {
                    this.field4946 = var9;
                }
            } else if (var6 > var9) {
                this.field4946 -= var13;
                if (this.field4946 < var9) {
                    this.field4946 = var9;
                }
            }
        }
        if (this.field4944 == var8 && this.field4946 == var9) {
            this.field4950--;
        }
    }
}
