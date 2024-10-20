package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("az")
public class class160 extends class185 {

    @ObfuscatedName("az.b")
    public AudioFormat field2413;

    @ObfuscatedName("az.k")
    public int field2415;

    @ObfuscatedName("az.h")
    public SourceDataLine field2414;

    @ObfuscatedName("az.w")
    public byte[] field2416;

    @ObfuscatedName("az.w()V")
    public void method2756() {
        int var1 = 256;
        if (Statics.field2825) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2831[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field2416[var2 * 2] = (byte) (var3 >> 8);
            this.field2416[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2414.write(this.field2416, 0, var1 << 1);
    }

    @ObfuscatedName("az.h(I)V")
    public void method2758(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field2413, arg0 << (Statics.field2825 ? 2 : 1));
            this.field2414 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2414.open();
            this.field2414.start();
            this.field2415 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field2414 = null;
                throw var11;
            } else {
                this.method2758(class26.method2874(arg0));
            }
        }
    }

    @ObfuscatedName("az.t()V")
    public void method2759() {
        if (this.field2414 != null) {
            this.field2414.close();
            this.field2414 = null;
        }
    }

    @ObfuscatedName("az.k()I")
    public int method2761() {
        return this.field2415 - (this.field2414.available() >> (Statics.field2825 ? 2 : 1));
    }

    @ObfuscatedName("az.b(Ljava/awt/Component;)V")
    public void method2762(Component arg0) {
        this.field2413 = new AudioFormat((float) Statics.field2840, 16, Statics.field2825 ? 2 : 1, true, false);
        this.field2416 = new byte[0x100 << (Statics.field2825 ? 2 : 1)];
    }

    @ObfuscatedName("az.d()V")
    public void method2769() {
        this.field2414.flush();
    }
}
