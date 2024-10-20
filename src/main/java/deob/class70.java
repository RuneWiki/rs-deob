package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bv")
public class class70 extends class57 {

    @ObfuscatedName("bv.m")
    public AudioFormat field1240;

    @ObfuscatedName("bv.l")
    public SourceDataLine field1243;

    @ObfuscatedName("bv.ac")
    public int field1242;

    @ObfuscatedName("bv.ar")
    public byte[] field1241;

    @ObfuscatedName("bv.m(Ljava/awt/Component;)V")
    public void method1129(Component arg0) {
        this.field1240 = new AudioFormat((float) Statics.field1139, 16, Statics.field1135 ? 2 : 1, true, false);
        this.field1241 = new byte[0x100 << (Statics.field1135 ? 2 : 1)];
    }

    @ObfuscatedName("bv.l(I)V")
    public void method1147(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1240, arg0 << (Statics.field1135 ? 2 : 1));
            this.field1243 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1243.open();
            this.field1243.start();
            this.field1242 = arg0;
        } catch (LineUnavailableException var11) {
            if (class126.method761(arg0) == 1) {
                this.field1243 = null;
                throw var11;
            }
            int var4 = arg0 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            int var10 = var9 + 1;
            this.method1147(var10);
        }
    }

    @ObfuscatedName("bv.y()I")
    public int method1131() {
        return this.field1242 - (this.field1243.available() >> (Statics.field1135 ? 2 : 1));
    }

    @ObfuscatedName("bv.u()V")
    public void method1146() {
        int var1 = 256;
        if (Statics.field1135) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1136[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1241[var2 * 2] = (byte) (var3 >> 8);
            this.field1241[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1243.write(this.field1241, 0, var1 << 1);
    }

    @ObfuscatedName("bv.k()V")
    public void method1133() {
        if (this.field1243 != null) {
            this.field1243.close();
            this.field1243 = null;
        }
    }

    @ObfuscatedName("bv.j()V")
    public void method1130() {
        this.field1243.flush();
    }
}
