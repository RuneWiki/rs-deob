package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bq")
public class class70 extends class57 {

    @ObfuscatedName("bq.o")
    public AudioFormat field1278;

    @ObfuscatedName("bq.f")
    public SourceDataLine field1280;

    @ObfuscatedName("bq.ah")
    public int field1277;

    @ObfuscatedName("bq.al")
    public byte[] field1279;

    @ObfuscatedName("bq.o(Ljava/awt/Component;)V")
    public void method1049(Component arg0) {
        this.field1278 = new AudioFormat((float) Statics.field1172, 16, Statics.field2662 ? 2 : 1, true, false);
        this.field1279 = new byte[0x100 << (Statics.field2662 ? 2 : 1)];
    }

    @ObfuscatedName("bq.f(I)V")
    public void method1047(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1278, arg0 << (Statics.field2662 ? 2 : 1));
            this.field1280 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1280.open();
            this.field1280.start();
            this.field1277 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1280 = null;
                throw var11;
            } else {
                this.method1047(class126.method1451(arg0));
            }
        }
    }

    @ObfuscatedName("bq.i()I")
    public int method1051() {
        return this.field1277 - (this.field1280.available() >> (Statics.field2662 ? 2 : 1));
    }

    @ObfuscatedName("bq.h()V")
    public void method1052() {
        int var1 = 256;
        if (Statics.field2662) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1171[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1279[var2 * 2] = (byte) (var3 >> 8);
            this.field1279[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1280.write(this.field1279, 0, var1 << 1);
    }

    @ObfuscatedName("bq.q()V")
    public void method1050() {
        if (this.field1280 != null) {
            this.field1280.close();
            this.field1280 = null;
        }
    }

    @ObfuscatedName("bq.u()V")
    public void method1063() {
        this.field1280.flush();
    }
}
