package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bi")
public class class73 extends class60 {

    @ObfuscatedName("bi.ak")
    public AudioFormat field1356;

    @ObfuscatedName("bi.as")
    public SourceDataLine field1355;

    @ObfuscatedName("bi.ae")
    public int field1354;

    @ObfuscatedName("bi.ao")
    public byte[] field1357;

    @ObfuscatedName("bi.i(Ljava/awt/Component;B)V")
    public void method1252(Component arg0) {
        this.field1356 = new AudioFormat((float) Statics.field1261, 16, Statics.field1243 ? 2 : 1, true, false);
        this.field1357 = new byte[0x100 << (Statics.field1243 ? 2 : 1)];
    }

    @ObfuscatedName("bi.q(II)V")
    public void method1253(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1356, arg0 << (Statics.field1243 ? 2 : 1));
            this.field1355 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1355.open();
            this.field1355.start();
            this.field1354 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1355 = null;
                throw var11;
            } else {
                this.method1253(class130.method1001(arg0));
            }
        }
    }

    @ObfuscatedName("bi.g(I)I")
    public int method1254() {
        return this.field1354 - (this.field1355.available() >> (Statics.field1243 ? 2 : 1));
    }

    @ObfuscatedName("bi.j()V")
    public void method1255() {
        int var1 = 256;
        if (Statics.field1243) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1248[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1357[var2 * 2] = (byte) (var3 >> 8);
            this.field1357[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1355.write(this.field1357, 0, var1 << 1);
    }

    @ObfuscatedName("bi.w(I)V")
    public void method1256() {
        if (this.field1355 != null) {
            this.field1355.close();
            this.field1355 = null;
        }
    }

    @ObfuscatedName("bi.x(B)V")
    public void method1257() {
        this.field1355.flush();
    }
}
