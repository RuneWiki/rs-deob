package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bq")
public class class70 extends class57 {

    @ObfuscatedName("bq.c")
    public AudioFormat field1278;

    @ObfuscatedName("bq.h")
    public SourceDataLine field1277;

    @ObfuscatedName("bq.az")
    public int field1279;

    @ObfuscatedName("bq.at")
    public byte[] field1280;

    @ObfuscatedName("bq.c(Ljava/awt/Component;)V")
    public void method1071(Component arg0) {
        this.field1278 = new AudioFormat((float) Statics.field1191, 16, Statics.field642 ? 2 : 1, true, false);
        this.field1280 = new byte[0x100 << (Statics.field642 ? 2 : 1)];
    }

    @ObfuscatedName("bq.h(I)V")
    public void method1080(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1278, arg0 << (Statics.field642 ? 2 : 1));
            this.field1277 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1277.open();
            this.field1277.start();
            this.field1279 = arg0;
        } catch (LineUnavailableException var11) {
            if (class126.method2547(arg0) == 1) {
                this.field1277 = null;
                throw var11;
            }
            int var4 = arg0 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            int var10 = var9 + 1;
            this.method1080(var10);
        }
    }

    @ObfuscatedName("bq.k()I")
    public int method1073() {
        return this.field1279 - (this.field1277.available() >> (Statics.field642 ? 2 : 1));
    }

    @ObfuscatedName("bq.t()V")
    public void method1083() {
        int var1 = 256;
        if (Statics.field642) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1175[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1280[var2 * 2] = (byte) (var3 >> 8);
            this.field1280[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1277.write(this.field1280, 0, var1 << 1);
    }

    @ObfuscatedName("bq.g()V")
    public void method1087() {
        if (this.field1277 != null) {
            this.field1277.close();
            this.field1277 = null;
        }
    }

    @ObfuscatedName("bq.o()V")
    public void method1074() {
        this.field1277.flush();
    }
}
