package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bb")
public class class64 extends class51 {

    @ObfuscatedName("bb.a")
    public AudioFormat field1194;

    @ObfuscatedName("bb.v")
    public SourceDataLine field1193;

    @ObfuscatedName("bb.ar")
    public int field1192;

    @ObfuscatedName("bb.ae")
    public byte[] field1195;

    @ObfuscatedName("bb.a(Ljava/awt/Component;)V")
    public void method966(Component arg0) {
        this.field1194 = new AudioFormat((float) Statics.field1084, 16, Statics.field1083 ? 2 : 1, true, false);
        this.field1195 = new byte[0x100 << (Statics.field1083 ? 2 : 1)];
    }

    @ObfuscatedName("bb.v(I)V")
    public void method949(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1194, arg0 << (Statics.field1083 ? 2 : 1));
            this.field1193 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1193.open();
            this.field1193.start();
            this.field1192 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1193 = null;
                throw var11;
            } else {
                this.method949(class117.method29(arg0));
            }
        }
    }

    @ObfuscatedName("bb.i()I")
    public int method947() {
        return this.field1192 - (this.field1193.available() >> (Statics.field1083 ? 2 : 1));
    }

    @ObfuscatedName("bb.b()V")
    public void method950() {
        int var1 = 256;
        if (Statics.field1083) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1087[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1195[var2 * 2] = (byte) (var3 >> 8);
            this.field1195[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1193.write(this.field1195, 0, var1 << 1);
    }

    @ObfuscatedName("bb.l()V")
    public void method955() {
        if (this.field1193 != null) {
            this.field1193.close();
            this.field1193 = null;
        }
    }

    @ObfuscatedName("bb.m()V")
    public void method952() {
        this.field1193.flush();
    }
}
