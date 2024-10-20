package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("by")
public class class60 extends class58 {

    @ObfuscatedName("by.aw")
    public AudioFormat field1070;

    @ObfuscatedName("by.ay")
    public SourceDataLine field1069;

    @ObfuscatedName("by.as")
    public int field1068;

    @ObfuscatedName("by.ai")
    public byte[] field1071;

    @ObfuscatedName("by.y(Ljava/awt/Component;B)V")
    public void method1017(Component arg0) {
        this.field1070 = new AudioFormat((float) Statics.field1032, 16, Statics.field1047 ? 2 : 1, true, false);
        this.field1071 = new byte[0x100 << (Statics.field1047 ? 2 : 1)];
    }

    @ObfuscatedName("by.e(II)V")
    public void method1045(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1070, arg0 << (Statics.field1047 ? 2 : 1));
            this.field1069 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1069.open();
            this.field1069.start();
            this.field1068 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1069 = null;
                throw var11;
            } else {
                this.method1045(class165.method3371(arg0));
            }
        }
    }

    @ObfuscatedName("by.x(I)I")
    public int method1019() {
        return this.field1068 - (this.field1069.available() >> (Statics.field1047 ? 2 : 1));
    }

    @ObfuscatedName("by.f()V")
    public void method1020() {
        int var1 = 256;
        if (Statics.field1047) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1036[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1071[var2 * 2] = (byte) (var3 >> 8);
            this.field1071[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1069.write(this.field1071, 0, var1 << 1);
    }

    @ObfuscatedName("by.s(I)V")
    public void method1021() {
        if (this.field1069 != null) {
            this.field1069.close();
            this.field1069 = null;
        }
    }

    @ObfuscatedName("by.o(I)V")
    public void method1011() {
        this.field1069.flush();
    }
}
