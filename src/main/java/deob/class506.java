package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@ObfuscatedName("tf")
public class class506 extends class504 {

    @ObfuscatedName("tf.bw")
    public int field5063;

    @ObfuscatedName("tf.bl")
    public boolean field5071;

    @ObfuscatedName("tf.be")
    public int field5065;

    @ObfuscatedName("tf.bg")
    public int field5066;

    @ObfuscatedName("tf.bu")
    public int field5067;

    @ObfuscatedName("tf.bh")
    public int field5080;

    @ObfuscatedName("tf.bk")
    public int field5069;

    @ObfuscatedName("tf.bp")
    public boolean field5075;

    @ObfuscatedName("tf.br")
    public int field5087;

    @ObfuscatedName("tf.bx")
    public int field5062;

    @ObfuscatedName("tf.bv")
    public int field5073;

    @ObfuscatedName("tf.bm")
    public int field5078;

    @ObfuscatedName("tf.bq")
    public String field5061;

    @ObfuscatedName("tf.bj")
    public String field5076;

    @ObfuscatedName("tf.bc")
    public String field5077;

    @ObfuscatedName("tf.bz")
    public String field5081;

    @ObfuscatedName("tf.ba")
    public int field5079;

    @ObfuscatedName("tf.bb")
    public int field5082;

    @ObfuscatedName("tf.by")
    public int field5070;

    @ObfuscatedName("tf.cw")
    public int field5058;

    @ObfuscatedName("tf.ck")
    public String field5083;

    @ObfuscatedName("tf.cn")
    public String field5084;

    @ObfuscatedName("tf.ch")
    public int[] field5085 = new int[3];

    @ObfuscatedName("tf.cp")
    public int field5086;

    @ObfuscatedName("tf.cd")
    public String field5064;

    @ObfuscatedName("tf.cs")
    public String field5088;

    public class506(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, String arg12, String arg13, String arg14, String arg15, int arg16, int arg17, int arg18, int arg19, String arg20, String arg21, int[] arg22, int arg23, String arg24, String arg25, String arg26) {
        this.field5063 = arg0;
        this.field5071 = arg1;
        this.field5065 = arg2;
        this.field5066 = arg3;
        this.field5067 = arg4;
        this.field5080 = arg5;
        this.field5069 = arg6;
        this.field5075 = arg7;
        this.field5087 = arg8;
        this.field5062 = arg9;
        this.field5073 = arg10;
        this.field5078 = arg11;
        this.field5061 = arg12;
        this.field5076 = arg13;
        this.field5077 = arg14;
        this.field5081 = arg15;
        this.field5079 = arg16;
        this.field5082 = arg17;
        this.field5070 = arg18;
        this.field5058 = arg19;
        this.field5083 = arg20;
        this.field5084 = arg21;
        this.field5085 = arg22;
        this.field5086 = arg23;
        this.field5064 = arg24;
        this.field5088 = arg25;
    }

    @ObfuscatedName("tf.ak(Lua;B)V")
    public void method8205(class546 arg0) {
        arg0.method8779(9);
        arg0.method8779(this.field5063);
        arg0.method8779(this.field5071 ? 1 : 0);
        arg0.method8780(this.field5065);
        arg0.method8779(this.field5066);
        arg0.method8779(this.field5067);
        arg0.method8779(this.field5080);
        arg0.method8779(this.field5069);
        arg0.method8779(this.field5075 ? 1 : 0);
        arg0.method8780(this.field5087);
        arg0.method8779(this.field5062);
        arg0.method8781(this.field5073);
        arg0.method8780(this.field5078);
        arg0.method8787(this.field5061);
        arg0.method8787(this.field5076);
        arg0.method8787(this.field5077);
        arg0.method8787(this.field5081);
        arg0.method8779(this.field5082);
        arg0.method8780(this.field5079);
        arg0.method8787(this.field5083);
        arg0.method8787(this.field5084);
        arg0.method8779(this.field5070);
        arg0.method8779(this.field5058);
        for (int var2 = 0; var2 < this.field5085.length; var2++) {
            arg0.method8981(this.field5085[var2]);
        }
        arg0.method8981(this.field5086);
        arg0.method8787(this.field5064);
        arg0.method8787(this.field5088);
    }

    @ObfuscatedName("tf.al(B)I")
    public int method8204() {
        byte var1 = 39;
        int var2 = var1 + class546.method5854(this.field5061);
        int var3 = var2 + class546.method5854(this.field5076);
        int var4 = var3 + class546.method5854(this.field5077);
        int var5 = var4 + class546.method5854(this.field5081);
        int var6 = var5 + class546.method5854(this.field5083);
        int var7 = var6 + class546.method5854(this.field5084);
        int var8 = var7 + class546.method5854(this.field5064);
        return var8 + class546.method5854(this.field5088);
    }

    @ObfuscatedName("tf.aj(II)Ljava/lang/String;")
    public String method8206(int arg0) {
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
