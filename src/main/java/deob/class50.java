package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ap")
public class class50 extends class51 {

    @ObfuscatedName("ap.j")
    public AudioFormat field1065;

    @ObfuscatedName("ap.y")
    public SourceDataLine field1064;

    @ObfuscatedName("ap.x")
    public int field1066;

    @ObfuscatedName("ap.z")
    public byte[] field1067;

    @ObfuscatedName("ap.j(Ljava/awt/Component;)V")
    public void method911(Component arg0) {
        this.field1065 = new AudioFormat((float) Statics.field1091, 16, Statics.field2033 ? 2 : 1, true, false);
        this.field1067 = new byte[0x100 << (Statics.field2033 ? 2 : 1)];
    }

    @ObfuscatedName("ap.y(I)V")
    public void method903(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1065, arg0 << (Statics.field2033 ? 2 : 1));
            this.field1064 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1064.open();
            this.field1064.start();
            this.field1066 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1064 = null;
                throw var11;
            } else {
                this.method903(class123.method1561(arg0));
            }
        }
    }

    @ObfuscatedName("ap.x()I")
    public int method905() {
        return this.field1066 - (this.field1064.available() >> (Statics.field2033 ? 2 : 1));
    }

    @ObfuscatedName("ap.z()V")
    public void method906() {
        int var1 = 256;
        if (Statics.field2033) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1072[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1067[var2 * 2] = (byte) (var3 >> 8);
            this.field1067[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1064.write(this.field1067, 0, var1 << 1);
    }

    @ObfuscatedName("ap.c()V")
    public void method907() {
        if (this.field1064 != null) {
            this.field1064.close();
            this.field1064 = null;
        }
    }

    @ObfuscatedName("ap.e()V")
    public void method908() {
        this.field1064.flush();
    }
}
