package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@ObfuscatedName("te")
public class class508 extends class506 implements class116 {

    @ObfuscatedName("te.bd")
    public int field5099;

    @ObfuscatedName("te.bh")
    public boolean field5109;

    @ObfuscatedName("te.bx")
    public int field5105;

    @ObfuscatedName("te.bv")
    public int field5095;

    @ObfuscatedName("te.bu")
    public int field5092;

    @ObfuscatedName("te.bp")
    public int field5097;

    @ObfuscatedName("te.br")
    public int field5098;

    @ObfuscatedName("te.bf")
    public boolean field5096;

    @ObfuscatedName("te.bq")
    public int field5100;

    @ObfuscatedName("te.bt")
    public int field5086;

    @ObfuscatedName("te.be")
    public int field5103;

    @ObfuscatedName("te.ba")
    public int field5104;

    @ObfuscatedName("te.bn")
    public String field5110;

    @ObfuscatedName("te.bw")
    public String field5117;

    @ObfuscatedName("te.bk")
    public String field5107;

    @ObfuscatedName("te.bs")
    public String field5108;

    @ObfuscatedName("te.bb")
    public int field5084;

    @ObfuscatedName("te.by")
    public int field5106;

    @ObfuscatedName("te.bl")
    public int field5111;

    @ObfuscatedName("te.cx")
    public int field5112;

    @ObfuscatedName("te.cu")
    public String field5113;

    @ObfuscatedName("te.cz")
    public String field5114;

    @ObfuscatedName("te.cm")
    public int[] field5115 = new int[3];

    @ObfuscatedName("te.ct")
    public int field5093;

    @ObfuscatedName("te.cl")
    public String field5102;

    @ObfuscatedName("te.cb")
    public String field5118;

    public class508(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, String arg12, String arg13, String arg14, String arg15, int arg16, int arg17, int arg18, int arg19, String arg20, String arg21, int[] arg22, int arg23, String arg24, String arg25, String arg26) {
        this.field5099 = arg0;
        this.field5109 = arg1;
        this.field5105 = arg2;
        this.field5095 = arg3;
        this.field5092 = arg4;
        this.field5097 = arg5;
        this.field5098 = arg6;
        this.field5096 = arg7;
        this.field5100 = arg8;
        this.field5086 = arg9;
        this.field5103 = arg10;
        this.field5104 = arg11;
        this.field5110 = arg12;
        this.field5117 = arg13;
        this.field5107 = arg14;
        this.field5108 = arg15;
        this.field5084 = arg16;
        this.field5106 = arg17;
        this.field5111 = arg18;
        this.field5112 = arg19;
        this.field5113 = arg20;
        this.field5114 = arg21;
        this.field5115 = arg22;
        this.field5093 = arg23;
        this.field5102 = arg24;
        this.field5118 = arg25;
    }

    @ObfuscatedName("te.ab(Lvg;I)V")
    public void method8242(class549 arg0) {
        arg0.method8781(9);
        arg0.method8781(this.field5099);
        arg0.method8781(this.field5109 ? 1 : 0);
        arg0.method8782(this.field5105);
        arg0.method8781(this.field5095);
        arg0.method8781(this.field5092);
        arg0.method8781(this.field5097);
        arg0.method8781(this.field5098);
        arg0.method8781(this.field5096 ? 1 : 0);
        arg0.method8782(this.field5100);
        arg0.method8781(this.field5086);
        arg0.method8783(this.field5103);
        arg0.method8782(this.field5104);
        arg0.method8788(this.field5110);
        arg0.method8788(this.field5117);
        arg0.method8788(this.field5107);
        arg0.method8788(this.field5108);
        arg0.method8781(this.field5106);
        arg0.method8782(this.field5084);
        arg0.method8788(this.field5113);
        arg0.method8788(this.field5114);
        arg0.method8781(this.field5111);
        arg0.method8781(this.field5112);
        for (int var2 = 0; var2 < this.field5115.length; var2++) {
            arg0.method9045(this.field5115[var2]);
        }
        arg0.method9045(this.field5093);
        arg0.method8788(this.field5102);
        arg0.method8788(this.field5118);
    }

    @ObfuscatedName("te.ay(S)I")
    public int method8245() {
        byte var1 = 39;
        String var3 = this.field5110;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field5117;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field5107;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field5108;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field5113;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field5114;
        int var24 = var23.length() + 2;
        int var25 = var21 + var24;
        String var27 = this.field5102;
        int var28 = var27.length() + 2;
        int var29 = var25 + var28;
        String var31 = this.field5118;
        int var32 = var31.length() + 2;
        return var29 + var32;
    }

    @ObfuscatedName("te.an(II)Ljava/lang/String;")
    public String method8244(int arg0) {
        String var2 = "";
        String var3 = "12345678-0000-0000-0000-123456789012";
        String var4;
        switch(arg0) {
            case 1:
                var4 = "wmic csproduct get UUID";
                break;
            case 2:
                var4 = "system_profiler SPHardwareDataType | awk '/UUID/ { print $3; }'";
                break;
            case 3:
                var4 = "cat /etc/machine-id";
                break;
            default:
                return "Unknown";
        }
        try {
            Process var5 = Runtime.getRuntime().exec(var4);
            BufferedReader var6 = new BufferedReader(new InputStreamReader(var5.getInputStream()));
            StringBuilder var7 = new StringBuilder();
            String var8;
            while ((var8 = var6.readLine()) != null) {
                var7.append(var8 + "\n");
            }
            if (arg0 == 1) {
                var3 = var7.substring(var7.indexOf("\n"), var7.length()).trim();
            } else if (arg0 == 2) {
                int var9 = var7.indexOf("UUID: ") + 36;
                var3 = var7.substring(var7.indexOf("UUID: "), var9).replace("UUID: ", "");
            } else if (arg0 == 3) {
                if (var7.length() == 33) {
                    var7 = new StringBuilder(var7.substring(0, var7.length() - 1));
                }
                if (var7.length() == 32) {
                    var7.insert(20, "-");
                    var7.insert(16, "-");
                    var7.insert(12, "-");
                    var7.insert(8, "-");
                    var3 = var7.toString();
                } else {
                    var3 = "12345678-0000-0000-0000-123456789012";
                }
            }
        } catch (IOException var11) {
        }
        return var3;
    }
}
