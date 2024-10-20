package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("x")
public class class23 {

    @ObfuscatedName("x.v")
    public int field365;

    @ObfuscatedName("x.f")
    public class78 field364;

    @ObfuscatedName("x.n")
    public DataInputStream field356;

    @ObfuscatedName("x.c")
    public byte[] field354 = new byte[4];

    @ObfuscatedName("x.r")
    public int field355;

    @ObfuscatedName("x.k")
    public byte[] field359;

    @ObfuscatedName("x.e")
    public int field360;

    @ObfuscatedName("x.q")
    public long field361;

    public class23(class73 arg0, URL arg1) {
        this.field364 = arg0.method1515(arg1);
        this.field365 = 0;
        this.field361 = class120.method1383() + 30000L;
    }

    @ObfuscatedName("x.v(I)[B")
    public byte[] method205() throws IOException {
        if (class120.method1383() > this.field361) {
            throw new IOException();
        }
        if (this.field365 == 0) {
            if (this.field364.field1388 == 2) {
                throw new IOException();
            }
            if (this.field364.field1388 == 1) {
                this.field356 = (DataInputStream) this.field364.field1385;
                this.field365 = 1;
            }
        }
        if (this.field365 == 1) {
            int var1 = this.field356.available();
            if (var1 > 0) {
                if (this.field355 + var1 > 4) {
                    var1 = 4 - this.field355;
                }
                this.field355 += this.field356.read(this.field354, this.field355, var1);
                if (this.field355 == 4) {
                    int var2 = (new class126(this.field354)).method2500();
                    this.field359 = new byte[var2];
                    this.field365 = 2;
                }
            }
        }
        if (this.field365 == 2) {
            int var3 = this.field356.available();
            if (var3 > 0) {
                if (this.field360 + var3 > this.field359.length) {
                    var3 = this.field359.length - this.field360;
                }
                this.field360 += this.field356.read(this.field359, this.field360, var3);
                if (this.field360 == this.field359.length) {
                    return this.field359;
                }
            }
        }
        return null;
    }
}
