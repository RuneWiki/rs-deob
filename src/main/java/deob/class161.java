package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ay")
public class class161 extends class163 {

    @ObfuscatedName("ay.b")
    public int field2395;

    @ObfuscatedName("ay.c")
    public SourceDataLine field2394;

    @ObfuscatedName("ay.i")
    public byte[] field2393;

    @ObfuscatedName("ay.v")
    public AudioFormat field2396;

    @ObfuscatedName("ay.v(Ljava/awt/Component;)V")
    public void method2859(Component arg0) {
        this.field2396 = new AudioFormat((float) Statics.field1914, 16, Statics.field1773 ? 2 : 1, true, false);
        this.field2393 = new byte[0x100 << (Statics.field1773 ? 2 : 1)];
    }

    @ObfuscatedName("ay.c(I)V")
    public void method2860(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field2396, arg0 << (Statics.field1773 ? 2 : 1));
            this.field2394 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2394.open();
            this.field2394.start();
            this.field2395 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field2394 = null;
                throw var11;
            } else {
                this.method2860(class39.method742(arg0));
            }
        }
    }

    @ObfuscatedName("ay.i()V")
    public void method2862() {
        int var1 = 256;
        if (Statics.field1773) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2433[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field2393[var2 * 2] = (byte) (var3 >> 8);
            this.field2393[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2394.write(this.field2393, 0, var1 << 1);
    }

    @ObfuscatedName("ay.m()V")
    public void method2863() {
        if (this.field2394 != null) {
            this.field2394.close();
            this.field2394 = null;
        }
    }

    @ObfuscatedName("ay.z()V")
    public void method2867() {
        this.field2394.flush();
    }

    @ObfuscatedName("ay.b()I")
    public int method2876() {
        return this.field2395 - (this.field2394.available() >> (Statics.field1773 ? 2 : 1));
    }
}
