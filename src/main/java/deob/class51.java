package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("av")
public class class51 extends class52 {

    @ObfuscatedName("av.i")
    public AudioFormat field1092;

    @ObfuscatedName("av.v")
    public SourceDataLine field1091;

    @ObfuscatedName("av.m")
    public int field1093;

    @ObfuscatedName("av.j")
    public byte[] field1094;

    @ObfuscatedName("av.i(Ljava/awt/Component;)V")
    public void method957(Component arg0) {
        this.field1092 = new AudioFormat((float) Statics.field87, 16, Statics.field1112 ? 2 : 1, true, false);
        this.field1094 = new byte[0x100 << (Statics.field1112 ? 2 : 1)];
    }

    @ObfuscatedName("av.v(I)V")
    public void method969(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1092, arg0 << (Statics.field1112 ? 2 : 1));
            this.field1091 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1091.open();
            this.field1091.start();
            this.field1093 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1091 = null;
                throw var11;
            } else {
                this.method969(class124.method244(arg0));
            }
        }
    }

    @ObfuscatedName("av.m()I")
    public int method959() {
        return this.field1093 - (this.field1091.available() >> (Statics.field1112 ? 2 : 1));
    }

    @ObfuscatedName("av.j()V")
    public void method968() {
        int var1 = 256;
        if (Statics.field1112) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1100[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1094[var2 * 2] = (byte) (var3 >> 8);
            this.field1094[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1091.write(this.field1094, 0, var1 << 1);
    }

    @ObfuscatedName("av.o()V")
    public void method960() {
        if (this.field1091 != null) {
            this.field1091.close();
            this.field1091 = null;
        }
    }

    @ObfuscatedName("av.l()V")
    public void method961() {
        this.field1091.flush();
    }
}
