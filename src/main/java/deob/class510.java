package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@ObfuscatedName("tq")
public class class510 extends class508 implements class118 {

    @ObfuscatedName("tq.bs")
    public int field5135;

    @ObfuscatedName("tq.bw")
    public boolean field5136;

    @ObfuscatedName("tq.ba")
    public int field5137;

    @ObfuscatedName("tq.bj")
    public int field5144;

    @ObfuscatedName("tq.bp")
    public int field5154;

    @ObfuscatedName("tq.by")
    public int field5140;

    @ObfuscatedName("tq.bb")
    public int field5141;

    @ObfuscatedName("tq.bi")
    public boolean field5151;

    @ObfuscatedName("tq.bg")
    public int field5146;

    @ObfuscatedName("tq.bl")
    public int field5152;

    @ObfuscatedName("tq.bu")
    public int field5145;

    @ObfuscatedName("tq.br")
    public int field5131;

    @ObfuscatedName("tq.bo")
    public String field5147;

    @ObfuscatedName("tq.bv")
    public String field5148;

    @ObfuscatedName("tq.bt")
    public String field5149;

    @ObfuscatedName("tq.bq")
    public String field5150;

    @ObfuscatedName("tq.bk")
    public int field5143;

    @ObfuscatedName("tq.be")
    public int field5139;

    @ObfuscatedName("tq.bc")
    public int field5153;

    @ObfuscatedName("tq.cn")
    public int field5142;

    @ObfuscatedName("tq.ch")
    public String field5155;

    @ObfuscatedName("tq.cf")
    public String field5156;

    @ObfuscatedName("tq.cu")
    public int[] field5157 = new int[3];

    @ObfuscatedName("tq.cm")
    public int field5158;

    @ObfuscatedName("tq.cj")
    public String field5129;

    @ObfuscatedName("tq.cx")
    public String field5160;

    public class510(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, String arg12, String arg13, String arg14, String arg15, int arg16, int arg17, int arg18, int arg19, String arg20, String arg21, int[] arg22, int arg23, String arg24, String arg25, String arg26) {
        this.field5135 = arg0;
        this.field5136 = arg1;
        this.field5137 = arg2;
        this.field5144 = arg3;
        this.field5154 = arg4;
        this.field5140 = arg5;
        this.field5141 = arg6;
        this.field5151 = arg7;
        this.field5146 = arg8;
        this.field5152 = arg9;
        this.field5145 = arg10;
        this.field5131 = arg11;
        this.field5147 = arg12;
        this.field5148 = arg13;
        this.field5149 = arg14;
        this.field5150 = arg15;
        this.field5143 = arg16;
        this.field5139 = arg17;
        this.field5153 = arg18;
        this.field5142 = arg19;
        this.field5155 = arg20;
        this.field5156 = arg21;
        this.field5157 = arg22;
        this.field5158 = arg23;
        this.field5129 = arg24;
        this.field5160 = arg25;
    }

    @ObfuscatedName("tq.ac(Lvf;B)V")
    public void method8387(class551 arg0) {
        arg0.method9022(9);
        arg0.method9022(this.field5135);
        arg0.method9022(this.field5136 ? 1 : 0);
        arg0.method8958(this.field5137);
        arg0.method9022(this.field5144);
        arg0.method9022(this.field5154);
        arg0.method9022(this.field5140);
        arg0.method9022(this.field5141);
        arg0.method9022(this.field5151 ? 1 : 0);
        arg0.method8958(this.field5146);
        arg0.method9022(this.field5152);
        arg0.method9196(this.field5145);
        arg0.method8958(this.field5131);
        arg0.method8965(this.field5147);
        arg0.method8965(this.field5148);
        arg0.method8965(this.field5149);
        arg0.method8965(this.field5150);
        arg0.method9022(this.field5139);
        arg0.method8958(this.field5143);
        arg0.method8965(this.field5155);
        arg0.method8965(this.field5156);
        arg0.method9022(this.field5153);
        arg0.method9022(this.field5142);
        for (int var2 = 0; var2 < this.field5157.length; var2++) {
            arg0.method8960(this.field5157[var2]);
        }
        arg0.method8960(this.field5158);
        arg0.method8965(this.field5129);
        arg0.method8965(this.field5160);
    }

    @ObfuscatedName("tq.ae(I)I")
    public int method8388() {
        byte var1 = 39;
        int var2 = var1 + class551.method5762(this.field5147);
        int var3 = var2 + class551.method5762(this.field5148);
        int var4 = var3 + class551.method5762(this.field5149);
        int var5 = var4 + class551.method5762(this.field5150);
        int var6 = var5 + class551.method5762(this.field5155);
        int var7 = var6 + class551.method5762(this.field5156);
        int var8 = var7 + class551.method5762(this.field5129);
        return var8 + class551.method5762(this.field5160);
    }

    @ObfuscatedName("tq.ag(II)Ljava/lang/String;")
    public String method8389(int arg0) {
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
        BufferedReader var5 = null;
        try {
            Process var6 = Runtime.getRuntime().exec(var4);
            var5 = new BufferedReader(new InputStreamReader(var6.getInputStream()));
            StringBuilder var7 = new StringBuilder();
            String var8;
            while ((var8 = var5.readLine()) != null) {
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
        } catch (Exception var21) {
        } finally {
            try {
                if (var5 != null) {
                    var5.close();
                }
            } catch (IOException var20) {
            }
        }
        return var3;
    }
}
