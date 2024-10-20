package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("t")
public class class24 {

    @ObfuscatedName("t.p")
    public int field367;

    @ObfuscatedName("t.e")
    public class79 field361;

    @ObfuscatedName("t.a")
    public DataInputStream field369;

    @ObfuscatedName("t.h")
    public byte[] field363 = new byte[4];

    @ObfuscatedName("t.y")
    public int field370;

    @ObfuscatedName("t.j")
    public byte[] field365;

    @ObfuscatedName("t.l")
    public int field366;

    @ObfuscatedName("t.f")
    public long field373;

    public class24(class74 arg0, URL arg1) {
        this.field361 = arg0.method1519(arg1);
        this.field367 = 0;
        this.field373 = class121.method2() + 30000L;
    }

    @ObfuscatedName("t.p(I)[B")
    public byte[] method230() throws IOException {
        if (class121.method2() > this.field373) {
            throw new IOException();
        }
        if (this.field367 == 0) {
            if (this.field361.field1415 == 2) {
                throw new IOException();
            }
            if (this.field361.field1415 == 1) {
                this.field369 = (DataInputStream) this.field361.field1418;
                this.field367 = 1;
            }
        }
        if (this.field367 == 1) {
            int var1 = this.field369.available();
            if (var1 > 0) {
                if (this.field370 + var1 > 4) {
                    var1 = 4 - this.field370;
                }
                this.field370 += this.field369.read(this.field363, this.field370, var1);
                if (this.field370 == 4) {
                    int var2 = (new class127(this.field363)).method2617();
                    this.field365 = new byte[var2];
                    this.field367 = 2;
                }
            }
        }
        if (this.field367 == 2) {
            int var3 = this.field369.available();
            if (var3 > 0) {
                if (this.field366 + var3 > this.field365.length) {
                    var3 = this.field365.length - this.field366;
                }
                this.field366 += this.field369.read(this.field365, this.field366, var3);
                if (this.field366 == this.field365.length) {
                    return this.field365;
                }
            }
        }
        return null;
    }
}
