package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bx")
public class class70 extends class57 {

    @ObfuscatedName("bx.a")
    public AudioFormat field1292;

    @ObfuscatedName("bx.w")
    public SourceDataLine field1293;

    @ObfuscatedName("bx.ay")
    public int field1294;

    @ObfuscatedName("bx.af")
    public byte[] field1295;

    @ObfuscatedName("bx.a(Ljava/awt/Component;)V")
    public void method1194(Component arg0) {
        this.field1292 = new AudioFormat((float) Statics.field974, 16, Statics.field1634 ? 2 : 1, true, false);
        this.field1295 = new byte[0x100 << (Statics.field1634 ? 2 : 1)];
    }

    @ObfuscatedName("bx.w(I)V")
    public void method1202(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1292, arg0 << (Statics.field1634 ? 2 : 1));
            this.field1293 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1293.open();
            this.field1293.start();
            this.field1294 = arg0;
        } catch (LineUnavailableException var11) {
            if (class127.method2231(arg0) == 1) {
                this.field1293 = null;
                throw var11;
            }
            int var4 = arg0 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            int var10 = var9 + 1;
            this.method1202(var10);
        }
    }

    @ObfuscatedName("bx.d()I")
    public int method1198() {
        return this.field1294 - (this.field1293.available() >> (Statics.field1634 ? 2 : 1));
    }

    @ObfuscatedName("bx.c()V")
    public void method1197() {
        int var1 = 256;
        if (Statics.field1634) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1189[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1295[var2 * 2] = (byte) (var3 >> 8);
            this.field1295[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1293.write(this.field1295, 0, var1 << 1);
    }

    @ObfuscatedName("bx.y()V")
    public void method1201() {
        if (this.field1293 != null) {
            this.field1293.close();
            this.field1293 = null;
        }
    }

    @ObfuscatedName("bx.k()V")
    public void method1195() {
        this.field1293.flush();
    }
}
