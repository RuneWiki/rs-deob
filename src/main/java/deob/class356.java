package deob;

@ObfuscatedName("mz")
public class class356 extends class354 {

    @ObfuscatedName("mz.ab")
    public int field3986;

    @ObfuscatedName("mz.ax")
    public boolean field3980;

    @ObfuscatedName("mz.au")
    public int field3997;

    @ObfuscatedName("mz.av")
    public int field3989;

    @ObfuscatedName("mz.as")
    public int field3990;

    @ObfuscatedName("mz.ao")
    public int field3991;

    @ObfuscatedName("mz.az")
    public int field3992;

    @ObfuscatedName("mz.ak")
    public boolean field3993;

    @ObfuscatedName("mz.aj")
    public int field4010;

    @ObfuscatedName("mz.at")
    public int field3996;

    @ObfuscatedName("mz.ar")
    public int field4006;

    @ObfuscatedName("mz.ay")
    public int field3998;

    @ObfuscatedName("mz.ap")
    public String field3978;

    @ObfuscatedName("mz.ah")
    public String field3987;

    @ObfuscatedName("mz.ag")
    public String field4000;

    @ObfuscatedName("mz.ai")
    public String field4001;

    @ObfuscatedName("mz.ad")
    public int field4002;

    @ObfuscatedName("mz.ac")
    public int field4003;

    @ObfuscatedName("mz.aw")
    public int field4004;

    @ObfuscatedName("mz.bt")
    public int field4005;

    @ObfuscatedName("mz.bk")
    public String field3988;

    @ObfuscatedName("mz.br")
    public String field4008;

    @ObfuscatedName("mz.by")
    public int[] field3999 = new int[3];

    @ObfuscatedName("mz.bv")
    public int field4009;

    @ObfuscatedName("mz.bf")
    public String field3994;

    public class356(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, String arg12, String arg13, String arg14, String arg15, int arg16, int arg17, int arg18, int arg19, String arg20, String arg21, int[] arg22, int arg23, String arg24) {
        this.field3986 = arg0;
        this.field3980 = arg1;
        this.field3997 = arg2;
        this.field3989 = arg3;
        this.field3990 = arg4;
        this.field3991 = arg5;
        this.field3992 = arg6;
        this.field3993 = arg7;
        this.field4010 = arg8;
        this.field3996 = arg9;
        this.field4006 = arg10;
        this.field3998 = arg11;
        this.field3978 = arg12;
        this.field3987 = arg13;
        this.field4000 = arg14;
        this.field4001 = arg15;
        this.field4002 = arg16;
        this.field4003 = arg17;
        this.field4004 = arg18;
        this.field4005 = arg19;
        this.field3988 = arg20;
        this.field4008 = arg21;
        this.field3999 = arg22;
        this.field4009 = arg23;
        this.field3994 = arg24;
    }

    @ObfuscatedName("mz.s(Lnv;I)V")
    public void method5470(class385 arg0) {
        arg0.method5941(8);
        arg0.method5941(this.field3986);
        arg0.method5941(this.field3980 ? 1 : 0);
        arg0.method6132(this.field3997);
        arg0.method5941(this.field3989);
        arg0.method5941(this.field3990);
        arg0.method5941(this.field3991);
        arg0.method5941(this.field3992);
        arg0.method5941(this.field3993 ? 1 : 0);
        arg0.method6132(this.field4010);
        arg0.method5941(this.field3996);
        arg0.method6121(this.field4006);
        arg0.method6132(this.field3998);
        arg0.method5949(this.field3978);
        arg0.method5949(this.field3987);
        arg0.method5949(this.field4000);
        arg0.method5949(this.field4001);
        arg0.method5941(this.field4003);
        arg0.method6132(this.field4002);
        arg0.method5949(this.field3988);
        arg0.method5949(this.field4008);
        arg0.method5941(this.field4004);
        arg0.method5941(this.field4005);
        for (int var2 = 0; var2 < this.field3999.length; var2++) {
            arg0.method5944(this.field3999[var2]);
        }
        arg0.method5944(this.field4009);
        arg0.method5949(this.field3994);
    }

    @ObfuscatedName("mz.t(B)I")
    public int method5471() {
        byte var1 = 39;
        int var2 = var1 + class385.method4584(this.field3978);
        int var3 = var2 + class385.method4584(this.field3987);
        int var4 = var3 + class385.method4584(this.field4000);
        int var5 = var4 + class385.method4584(this.field4001);
        int var6 = var5 + class385.method4584(this.field3988);
        int var7 = var6 + class385.method4584(this.field4008);
        return var7 + class385.method4584(this.field3994);
    }
}
