package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bj")
public class class70 extends class57 {

    @ObfuscatedName("bj.n")
    public AudioFormat field1277;

    @ObfuscatedName("bj.q")
    public SourceDataLine field1278;

    @ObfuscatedName("bj.al")
    public int field1276;

    @ObfuscatedName("bj.aj")
    public byte[] field1279;

    @ObfuscatedName("bj.n(Ljava/awt/Component;)V")
    public void method1110(Component arg0) {
        this.field1277 = new AudioFormat((float) Statics.field2648, 16, Statics.field2070 ? 2 : 1, true, false);
        this.field1279 = new byte[0x100 << (Statics.field2070 ? 2 : 1)];
    }

    @ObfuscatedName("bj.q(I)V")
    public void method1111(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1277, arg0 << (Statics.field2070 ? 2 : 1));
            this.field1278 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1278.open();
            this.field1278.start();
            this.field1276 = arg0;
        } catch (LineUnavailableException var11) {
            if (class126.method35(arg0) == 1) {
                this.field1278 = null;
                throw var11;
            }
            int var4 = arg0 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            int var10 = var9 + 1;
            this.method1111(var10);
        }
    }

    @ObfuscatedName("bj.c()I")
    public int method1112() {
        return this.field1276 - (this.field1278.available() >> (Statics.field2070 ? 2 : 1));
    }

    @ObfuscatedName("bj.l()V")
    public void method1113() {
        int var1 = 256;
        if (Statics.field2070) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1185[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1279[var2 * 2] = (byte) (var3 >> 8);
            this.field1279[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1278.write(this.field1279, 0, var1 << 1);
    }

    @ObfuscatedName("bj.r()V")
    public void method1114() {
        if (this.field1278 != null) {
            this.field1278.close();
            this.field1278 = null;
        }
    }

    @ObfuscatedName("bj.u()V")
    public void method1124() {
        this.field1278.flush();
    }
}
