package deob;

@ObfuscatedName("um")
public class class532 {

    @ObfuscatedName("um.ay")
    public int field5198;

    @ObfuscatedName("um.ar")
    public int field5203;

    @ObfuscatedName("um.am")
    public int field5194;

    @ObfuscatedName("um.as")
    public int field5193;

    @ObfuscatedName("um.aj")
    public int field5202;

    @ObfuscatedName("um.ag")
    public int field5197;

    @ObfuscatedName("um.az")
    public int field5199 = 0;

    @ObfuscatedName("um.av")
    public int field5200 = 0;

    @ObfuscatedName("um.ap")
    public boolean field5201;

    @ObfuscatedName("um.aq")
    public int field5195;

    @ObfuscatedName("um.at")
    public int field5192;

    @ObfuscatedName("um.ah")
    public int field5204;

    @ObfuscatedName("um.ax")
    public int field5205;

    @ObfuscatedName("um.aw(IIIIIIIIZI)V")
    public void method8856(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        this.field5198 = arg0;
        this.field5203 = arg1;
        this.field5194 = arg2;
        this.field5193 = arg3;
        this.field5202 = arg4;
        this.field5197 = arg5;
        this.field5199 = arg6;
        this.field5200 = arg7;
        this.field5201 = arg8;
    }

    @ObfuscatedName("um.ay(IIIII)V")
    public void method8863(int arg0, int arg1, int arg2, int arg3) {
        this.field5195 = arg0;
        this.field5192 = arg1;
        this.field5204 = arg2;
        this.field5205 = arg3;
    }

    @ObfuscatedName("um.ar(Lpt;Lpc;I)V")
    public void method8854(class396 arg0, class395 arg1) {
        if (arg1 == null) {
            return;
        }
        int var3 = arg1.field4493;
        int var4 = Math.min(this.field5193, (int) ((float) var3 * 0.9F));
        int var5 = arg0.method6684(this.field5194);
        int var6 = arg0.method6685(this.field5193);
        int var7 = this.field5198 - this.field5202 + var5;
        int var8 = this.field5203 - this.field5197 + var6 + var3;
        class524.method8655(this.field5198, this.field5203, this.field5198 + this.field5194, this.field5203 + this.field5193);
        int var9 = this.field5200;
        int var10 = this.field5199;
        if (var9 > var10) {
            int var11 = var9;
            var9 = var10;
            var10 = var11;
        }
        class400 var12 = arg0.method6762(0, var9);
        class400 var13 = arg0.method6762(var9, var10);
        class400 var14 = arg0.method6762(var10, arg0.method6656());
        class400 var15 = arg0.method6762(0, this.field5199);
        if (!var13.method6916()) {
            int var16 = arg1.field4491 + arg1.field4488;
            for (int var17 = 0; var17 < var13.method6917(); var17++) {
                class398 var18 = var13.method6921(var17);
                int var19 = var18.field4480 + var7;
                int var20 = arg1.method6880(var18.field4481);
                int var21 = var18.field4482 + var8 - var3;
                class524.method8582(var19, var21, var20, var16, this.field5205);
            }
        }
        if (!var12.method6916()) {
            arg1.method6837(var12, var7, var8, this.field5195, this.field5192, -1);
        }
        if (!var13.method6916()) {
            arg1.method6837(var13, var7, var8, this.field5204, this.field5192, -1);
        }
        if (!var14.method6916()) {
            arg1.method6837(var14, var7, var8, this.field5195, this.field5192, -1);
        }
        if (!this.field5201) {
            return;
        }
        class487 var22 = var15.method6920();
        int var23 = var7 + (Integer) var22.field4965;
        int var24 = var8 + (Integer) var22.field4963;
        int var25 = var24 - var4;
        class524.method8632(var23, var24, var23, var25, this.field5195);
        if (this.field5192 != -1) {
            class524.method8632(var23 + 1, var24 + 1, var23 + 1, var25 + 1, this.field5192);
        }
    }
}
