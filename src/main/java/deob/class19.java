package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("a")
public class class19 {

    @ObfuscatedName("a.s")
    public int field249;

    @ObfuscatedName("a.j")
    public class147 field250;

    @ObfuscatedName("a.p")
    public DataInputStream field251;

    @ObfuscatedName("a.x")
    public byte[] field255 = new byte[4];

    @ObfuscatedName("a.d")
    public int field253;

    @ObfuscatedName("a.u")
    public byte[] field254;

    @ObfuscatedName("a.o")
    public int field262;

    @ObfuscatedName("a.b")
    public long field256;

    public class19(class137 arg0, URL arg1) {
        this.field250 = arg0.method2709(arg1);
        this.field249 = 0;
        this.field256 = class116.method157() + 30000L;
    }

    @ObfuscatedName("a.s(I)[B")
    public byte[] method202() throws IOException {
        if (class116.method157() > this.field256) {
            throw new IOException();
        }
        if (this.field249 == 0) {
            if (this.field250.field2227 == 2) {
                throw new IOException();
            }
            if (this.field250.field2227 == 1) {
                this.field251 = (DataInputStream) this.field250.field2225;
                this.field249 = 1;
            }
        }
        if (this.field249 == 1) {
            int var1 = this.field251.available();
            if (var1 > 0) {
                if (this.field253 + var1 > 4) {
                    var1 = 4 - this.field253;
                }
                this.field253 += this.field251.read(this.field255, this.field253, var1);
                if (this.field253 == 4) {
                    int var2 = (new class120(this.field255)).method2343();
                    this.field254 = new byte[var2];
                    this.field249 = 2;
                }
            }
        }
        if (this.field249 == 2) {
            int var3 = this.field251.available();
            if (var3 > 0) {
                if (this.field262 + var3 > this.field254.length) {
                    var3 = this.field254.length - this.field262;
                }
                this.field262 += this.field251.read(this.field254, this.field262, var3);
                if (this.field262 == this.field254.length) {
                    return this.field254;
                }
            }
        }
        return null;
    }
}
