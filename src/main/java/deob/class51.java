package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ai")
public class class51 extends class52 {

    @ObfuscatedName("ai.j")
    public AudioFormat field1084;

    @ObfuscatedName("ai.r")
    public SourceDataLine field1083;

    @ObfuscatedName("ai.v")
    public int field1085;

    @ObfuscatedName("ai.p")
    public byte[] field1082;

    @ObfuscatedName("ai.j(Ljava/awt/Component;)V")
    public void method922(Component arg0) {
        this.field1084 = new AudioFormat((float) Statics.field1205, 16, Statics.field1086 ? 2 : 1, true, false);
        this.field1082 = new byte[0x100 << (Statics.field1086 ? 2 : 1)];
    }

    @ObfuscatedName("ai.r(I)V")
    public void method918(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1084, arg0 << (Statics.field1086 ? 2 : 1));
            this.field1083 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1083.open();
            this.field1083.start();
            this.field1085 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1083 = null;
                throw var11;
            } else {
                this.method918(class124.method2348(arg0));
            }
        }
    }

    @ObfuscatedName("ai.v()I")
    public int method919() {
        return this.field1085 - (this.field1083.available() >> (Statics.field1086 ? 2 : 1));
    }

    @ObfuscatedName("ai.p()V")
    public void method920() {
        int var1 = 256;
        if (Statics.field1086) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1089[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1082[var2 * 2] = (byte) (var3 >> 8);
            this.field1082[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1083.write(this.field1082, 0, var1 << 1);
    }

    @ObfuscatedName("ai.e()V")
    public void method938() {
        if (this.field1083 != null) {
            this.field1083.close();
            this.field1083 = null;
        }
    }

    @ObfuscatedName("ai.d()V")
    public void method916() {
        this.field1083.flush();
    }
}
