package deob;

@ObfuscatedName("lx")
public class class331 extends class181 {

    @ObfuscatedName("lx.an")
    public int field3916;

    @ObfuscatedName("lx.at")
    public boolean field3931;

    @ObfuscatedName("lx.as")
    public int field3918;

    @ObfuscatedName("lx.ak")
    public int field3919;

    @ObfuscatedName("lx.ao")
    public int field3914;

    @ObfuscatedName("lx.ac")
    public int field3920;

    @ObfuscatedName("lx.ar")
    public int field3922;

    @ObfuscatedName("lx.au")
    public boolean field3923;

    @ObfuscatedName("lx.ax")
    public int field3924;

    @ObfuscatedName("lx.ag")
    public int field3925;

    @ObfuscatedName("lx.ap")
    public int field3926;

    @ObfuscatedName("lx.aq")
    public int field3927;

    @ObfuscatedName("lx.ay")
    public String field3928;

    @ObfuscatedName("lx.ad")
    public String field3929;

    @ObfuscatedName("lx.al")
    public String field3939;

    @ObfuscatedName("lx.ah")
    public String field3933;

    @ObfuscatedName("lx.ab")
    public int field3932;

    @ObfuscatedName("lx.aw")
    public int field3937;

    @ObfuscatedName("lx.ae")
    public int field3934;

    @ObfuscatedName("lx.bk")
    public int field3935;

    @ObfuscatedName("lx.bw")
    public String field3936;

    @ObfuscatedName("lx.bo")
    public String field3908;

    @ObfuscatedName("lx.bn")
    public int[] field3938 = new int[3];

    @ObfuscatedName("lx.bp")
    public int field3906;

    @ObfuscatedName("lx.bz")
    public String field3940;

    public class331(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, String arg12, String arg13, String arg14, String arg15, int arg16, int arg17, int arg18, int arg19, String arg20, String arg21, int[] arg22, int arg23, String arg24) {
        this.field3916 = arg0;
        this.field3931 = arg1;
        this.field3918 = arg2;
        this.field3919 = arg3;
        this.field3914 = arg4;
        this.field3920 = arg5;
        this.field3922 = arg6;
        this.field3923 = arg7;
        this.field3924 = arg8;
        this.field3925 = arg9;
        this.field3926 = arg10;
        this.field3927 = arg11;
        this.field3928 = arg12;
        this.field3929 = arg13;
        this.field3939 = arg14;
        this.field3933 = arg15;
        this.field3932 = arg16;
        this.field3937 = arg17;
        this.field3934 = arg18;
        this.field3935 = arg19;
        this.field3936 = arg20;
        this.field3908 = arg21;
        this.field3938 = arg22;
        this.field3906 = arg23;
        this.field3940 = arg24;
    }

    @ObfuscatedName("lx.s(Lky;I)V")
    public void method5752(class300 arg0) {
        arg0.method5083(8);
        arg0.method5083(this.field3916);
        arg0.method5083(this.field3931 ? 1 : 0);
        arg0.method5037(this.field3918);
        arg0.method5083(this.field3919);
        arg0.method5083(this.field3914);
        arg0.method5083(this.field3920);
        arg0.method5083(this.field3922);
        arg0.method5083(this.field3923 ? 1 : 0);
        arg0.method5037(this.field3924);
        arg0.method5083(this.field3925);
        arg0.method5188(this.field3926);
        arg0.method5037(this.field3927);
        arg0.method5175(this.field3928);
        arg0.method5175(this.field3929);
        arg0.method5175(this.field3939);
        arg0.method5175(this.field3933);
        arg0.method5083(this.field3937);
        arg0.method5037(this.field3932);
        arg0.method5175(this.field3936);
        arg0.method5175(this.field3908);
        arg0.method5083(this.field3934);
        arg0.method5083(this.field3935);
        for (int var2 = 0; var2 < this.field3938.length; var2++) {
            arg0.method5166(this.field3938[var2]);
        }
        arg0.method5166(this.field3906);
        arg0.method5175(this.field3940);
    }

    @ObfuscatedName("lx.j(I)I")
    public int method5751() {
        byte var1 = 39;
        int var2 = var1 + class300.method57(this.field3928);
        int var3 = var2 + class300.method57(this.field3929);
        int var4 = var3 + class300.method57(this.field3939);
        int var5 = var4 + class300.method57(this.field3933);
        int var6 = var5 + class300.method57(this.field3936);
        String var8 = this.field3908;
        int var9 = var8.length() + 2;
        int var10 = var6 + var9;
        return var10 + class300.method57(this.field3940);
    }
}
