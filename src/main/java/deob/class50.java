package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ae")
public class class50 extends class51 {

    @ObfuscatedName("ae.u")
    public AudioFormat field1079;

    @ObfuscatedName("ae.k")
    public SourceDataLine field1078;

    @ObfuscatedName("ae.x")
    public int field1077;

    @ObfuscatedName("ae.m")
    public byte[] field1080;

    @ObfuscatedName("ae.u(Ljava/awt/Component;)V")
    public void method921(Component arg0) {
        this.field1079 = new AudioFormat((float) Statics.field1083, 16, Statics.field1091 ? 2 : 1, true, false);
        this.field1080 = new byte[0x100 << (Statics.field1091 ? 2 : 1)];
    }

    @ObfuscatedName("ae.k(I)V")
    public void method918(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1079, arg0 << (Statics.field1091 ? 2 : 1));
            this.field1078 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1078.open();
            this.field1078.start();
            this.field1077 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1078 = null;
                throw var11;
            } else {
                this.method918(class123.method2382(arg0));
            }
        }
    }

    @ObfuscatedName("ae.x()I")
    public int method919() {
        return this.field1077 - (this.field1078.available() >> (Statics.field1091 ? 2 : 1));
    }

    @ObfuscatedName("ae.m()V")
    public void method920() {
        int var1 = 256;
        if (Statics.field1091) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1085[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1080[var2 * 2] = (byte) (var3 >> 8);
            this.field1080[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1078.write(this.field1080, 0, var1 << 1);
    }

    @ObfuscatedName("ae.n()V")
    public void method939() {
        if (this.field1078 != null) {
            this.field1078.close();
            this.field1078 = null;
        }
    }

    @ObfuscatedName("ae.q()V")
    public void method930() {
        this.field1078.flush();
    }
}
