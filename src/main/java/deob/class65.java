package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bs")
public class class65 extends class52 {

    @ObfuscatedName("bs.n")
    public AudioFormat field1235;

    @ObfuscatedName("bs.o")
    public SourceDataLine field1233;

    @ObfuscatedName("bs.an")
    public int field1234;

    @ObfuscatedName("bs.ao")
    public byte[] field1236;

    @ObfuscatedName("bs.n(Ljava/awt/Component;)V")
    public void method1010(Component arg0) {
        this.field1235 = new AudioFormat((float) Statics.field1141, 16, Statics.field1126 ? 2 : 1, true, false);
        this.field1236 = new byte[0x100 << (Statics.field1126 ? 2 : 1)];
    }

    @ObfuscatedName("bs.o(I)V")
    public void method1012(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1235, arg0 << (Statics.field1126 ? 2 : 1));
            this.field1233 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1233.open();
            this.field1233.start();
            this.field1234 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1233 = null;
                throw var11;
            } else {
                this.method1012(class118.method2063(arg0));
            }
        }
    }

    @ObfuscatedName("bs.a()I")
    public int method1018() {
        return this.field1234 - (this.field1233.available() >> (Statics.field1126 ? 2 : 1));
    }

    @ObfuscatedName("bs.w()V")
    public void method1022() {
        int var1 = 256;
        if (Statics.field1126) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1128[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1236[var2 * 2] = (byte) (var3 >> 8);
            this.field1236[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1233.write(this.field1236, 0, var1 << 1);
    }

    @ObfuscatedName("bs.m()V")
    public void method1009() {
        if (this.field1233 != null) {
            this.field1233.close();
            this.field1233 = null;
        }
    }

    @ObfuscatedName("bs.h()V")
    public void method1025() {
        this.field1233.flush();
    }
}
