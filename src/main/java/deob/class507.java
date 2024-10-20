package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@ObfuscatedName("tr")
public class class507 extends class505 implements class116 {

    @ObfuscatedName("tr.ba")
    public int field5096;

    @ObfuscatedName("tr.bg")
    public boolean field5097;

    @ObfuscatedName("tr.bs")
    public int field5098;

    @ObfuscatedName("tr.bp")
    public int field5116;

    @ObfuscatedName("tr.bx")
    public int field5100;

    @ObfuscatedName("tr.bu")
    public int field5101;

    @ObfuscatedName("tr.by")
    public int field5091;

    @ObfuscatedName("tr.bw")
    public boolean field5103;

    @ObfuscatedName("tr.bl")
    public int field5109;

    @ObfuscatedName("tr.bc")
    public int field5102;

    @ObfuscatedName("tr.bb")
    public int field5106;

    @ObfuscatedName("tr.bn")
    public int field5107;

    @ObfuscatedName("tr.bh")
    public String field5108;

    @ObfuscatedName("tr.bq")
    public String field5105;

    @ObfuscatedName("tr.bd")
    public String field5104;

    @ObfuscatedName("tr.bz")
    public String field5111;

    @ObfuscatedName("tr.bk")
    public int field5114;

    @ObfuscatedName("tr.br")
    public int field5113;

    @ObfuscatedName("tr.bf")
    public int field5090;

    @ObfuscatedName("tr.cf")
    public int field5115;

    @ObfuscatedName("tr.cv")
    public String field5092;

    @ObfuscatedName("tr.cl")
    public String field5117;

    @ObfuscatedName("tr.cm")
    public int[] field5119 = new int[3];

    @ObfuscatedName("tr.cg")
    public int field5118;

    @ObfuscatedName("tr.cu")
    public String field5120;

    @ObfuscatedName("tr.cn")
    public String field5121;

    public class507(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, String arg12, String arg13, String arg14, String arg15, int arg16, int arg17, int arg18, int arg19, String arg20, String arg21, int[] arg22, int arg23, String arg24, String arg25, String arg26) {
        this.field5096 = arg0;
        this.field5097 = arg1;
        this.field5098 = arg2;
        this.field5116 = arg3;
        this.field5100 = arg4;
        this.field5101 = arg5;
        this.field5091 = arg6;
        this.field5103 = arg7;
        this.field5109 = arg8;
        this.field5102 = arg9;
        this.field5106 = arg10;
        this.field5107 = arg11;
        this.field5108 = arg12;
        this.field5105 = arg13;
        this.field5104 = arg14;
        this.field5111 = arg15;
        this.field5114 = arg16;
        this.field5113 = arg17;
        this.field5090 = arg18;
        this.field5115 = arg19;
        this.field5092 = arg20;
        this.field5117 = arg21;
        this.field5119 = arg22;
        this.field5118 = arg23;
        this.field5120 = arg24;
        this.field5121 = arg25;
    }

    @ObfuscatedName("tr.aq(Lvp;I)V")
    public void method8150(class547 arg0) {
        arg0.method8711(9);
        arg0.method8711(this.field5096);
        arg0.method8711(this.field5097 ? 1 : 0);
        arg0.method8712(this.field5098);
        arg0.method8711(this.field5116);
        arg0.method8711(this.field5100);
        arg0.method8711(this.field5101);
        arg0.method8711(this.field5091);
        arg0.method8711(this.field5103 ? 1 : 0);
        arg0.method8712(this.field5109);
        arg0.method8711(this.field5102);
        arg0.method8713(this.field5106);
        arg0.method8712(this.field5107);
        arg0.method8905(this.field5108);
        arg0.method8905(this.field5105);
        arg0.method8905(this.field5104);
        arg0.method8905(this.field5111);
        arg0.method8711(this.field5113);
        arg0.method8712(this.field5114);
        arg0.method8905(this.field5092);
        arg0.method8905(this.field5117);
        arg0.method8711(this.field5090);
        arg0.method8711(this.field5115);
        for (int var2 = 0; var2 < this.field5119.length; var2++) {
            arg0.method8714(this.field5119[var2]);
        }
        arg0.method8714(this.field5118);
        arg0.method8905(this.field5120);
        arg0.method8905(this.field5121);
    }

    @ObfuscatedName("tr.ad(B)I")
    public int method8155() {
        byte var1 = 39;
        String var3 = this.field5108;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field5105;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field5104;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field5111;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field5092;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field5117;
        int var24 = var23.length() + 2;
        int var25 = var21 + var24;
        String var27 = this.field5120;
        int var28 = var27.length() + 2;
        int var29 = var25 + var28;
        String var31 = this.field5121;
        int var32 = var31.length() + 2;
        return var29 + var32;
    }

    @ObfuscatedName("tr.ag(II)Ljava/lang/String;")
    public String method8152(int arg0) {
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
