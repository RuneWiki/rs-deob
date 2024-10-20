package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("aa")
public class class51 extends class52 {

    @ObfuscatedName("aa.l")
    public AudioFormat field1079;

    @ObfuscatedName("aa.b")
    public SourceDataLine field1080;

    @ObfuscatedName("aa.o")
    public int field1081;

    @ObfuscatedName("aa.w")
    public byte[] field1082;

    @ObfuscatedName("aa.l(Ljava/awt/Component;)V")
    public void method940(Component arg0) {
        this.field1079 = new AudioFormat((float) Statics.field745, 16, Statics.field1731 ? 2 : 1, true, false);
        this.field1082 = new byte[0x100 << (Statics.field1731 ? 2 : 1)];
    }

    @ObfuscatedName("aa.b(I)V")
    public void method924(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1079, arg0 << (Statics.field1731 ? 2 : 1));
            this.field1080 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1080.open();
            this.field1080.start();
            this.field1081 = arg0;
        } catch (LineUnavailableException var11) {
            if (class124.method117(arg0) == 1) {
                this.field1080 = null;
                throw var11;
            }
            int var4 = arg0 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            int var10 = var9 + 1;
            this.method924(var10);
        }
    }

    @ObfuscatedName("aa.o()I")
    public int method925() {
        return this.field1081 - (this.field1080.available() >> (Statics.field1731 ? 2 : 1));
    }

    @ObfuscatedName("aa.w()V")
    public void method926() {
        int var1 = 256;
        if (Statics.field1731) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1086[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1082[var2 * 2] = (byte) (var3 >> 8);
            this.field1082[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1080.write(this.field1082, 0, var1 << 1);
    }

    @ObfuscatedName("aa.r()V")
    public void method922() {
        if (this.field1080 != null) {
            this.field1080.close();
            this.field1080 = null;
        }
    }

    @ObfuscatedName("aa.k()V")
    public void method930() {
        this.field1080.flush();
    }
}
