package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("o")
public class class19 {

    @ObfuscatedName("o.w")
    public int field269;

    @ObfuscatedName("o.x")
    public class147 field264;

    @ObfuscatedName("o.t")
    public DataInputStream field267;

    @ObfuscatedName("o.p")
    public byte[] field266 = new byte[4];

    @ObfuscatedName("o.e")
    public int field273;

    @ObfuscatedName("o.y")
    public byte[] field265;

    @ObfuscatedName("o.m")
    public int field274;

    @ObfuscatedName("o.c")
    public long field270;

    public class19(class137 arg0, URL arg1) {
        this.field264 = arg0.method2738(arg1);
        this.field269 = 0;
        this.field270 = Statics.method162() + 30000L;
    }

    @ObfuscatedName("o.w(I)[B")
    public byte[] method188() throws IOException {
        if (Statics.method162() > this.field270) {
            throw new IOException();
        }
        if (this.field269 == 0) {
            if (this.field264.field2236 == 2) {
                throw new IOException();
            }
            if (this.field264.field2236 == 1) {
                this.field267 = (DataInputStream) this.field264.field2235;
                this.field269 = 1;
            }
        }
        if (this.field269 == 1) {
            int var1 = this.field267.available();
            if (var1 > 0) {
                if (this.field273 + var1 > 4) {
                    var1 = 4 - this.field273;
                }
                this.field273 += this.field267.read(this.field266, this.field273, var1);
                if (this.field273 == 4) {
                    int var2 = (new class120(this.field266)).method2368();
                    this.field265 = new byte[var2];
                    this.field269 = 2;
                }
            }
        }
        if (this.field269 == 2) {
            int var3 = this.field267.available();
            if (var3 > 0) {
                if (this.field274 + var3 > this.field265.length) {
                    var3 = this.field265.length - this.field274;
                }
                this.field274 += this.field267.read(this.field265, this.field274, var3);
                if (this.field274 == this.field265.length) {
                    return this.field265;
                }
            }
        }
        return null;
    }
}
