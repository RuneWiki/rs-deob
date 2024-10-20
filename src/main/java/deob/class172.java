package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fr")
public final class class172 extends class305 implements Runnable {

    @ObfuscatedName("fr.a")
    public InputStream field2046;

    @ObfuscatedName("fr.t")
    public OutputStream field2039;

    @ObfuscatedName("fr.n")
    public Socket field2040;

    @ObfuscatedName("fr.q")
    public boolean field2041 = false;

    @ObfuscatedName("fr.v")
    public class167 field2038;

    @ObfuscatedName("fr.l")
    public class166 field2043;

    @ObfuscatedName("fr.c")
    public byte[] field2051;

    @ObfuscatedName("fr.o")
    public int field2045 = 0;

    @ObfuscatedName("fr.i")
    public int field2042 = 0;

    @ObfuscatedName("fr.d")
    public boolean field2044 = false;

    @ObfuscatedName("fr.m")
    public final int field2048;

    @ObfuscatedName("fr.p")
    public final int field2049;

    public class172(Socket arg0, class167 arg1, int arg2) throws IOException {
        this.field2038 = arg1;
        this.field2040 = arg0;
        this.field2048 = arg2;
        this.field2049 = arg2 - 100;
        this.field2040.setSoTimeout(30000);
        this.field2040.setTcpNoDelay(true);
        this.field2040.setReceiveBufferSize(65536);
        this.field2040.setSendBufferSize(65536);
        this.field2046 = this.field2040.getInputStream();
        this.field2039 = this.field2040.getOutputStream();
    }

    @ObfuscatedName("fr.a(I)V")
    public void method3292() {
        if (this.field2041) {
            return;
        }
        synchronized (this) {
            this.field2041 = true;
            this.notifyAll();
        }
        if (this.field2043 != null) {
            while (this.field2043.field2007 == 0) {
                Statics.method4888(1L);
            }
            if (this.field2043.field2007 == 1) {
                try {
                    ((Thread) this.field2043.field2011).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2043 = null;
    }

    public void finalize() {
        this.method3292();
    }

    @ObfuscatedName("fr.t(B)I")
    public int method3315() throws IOException {
        return this.field2041 ? 0 : this.field2046.read();
    }

    @ObfuscatedName("fr.n(B)I")
    public int method3291() throws IOException {
        return this.field2041 ? 0 : this.field2046.available();
    }

    @ObfuscatedName("fr.q(II)Z")
    public boolean method3296(int arg0) throws IOException {
        if (this.field2041) {
            return false;
        } else {
            return this.field2046.available() >= arg0;
        }
    }

    @ObfuscatedName("fr.v([BIII)I")
    public int method3318(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2041) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field2046.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("fr.l([BIII)V")
    public void method3323(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2041) {
            return;
        }
        if (this.field2044) {
            this.field2044 = false;
            throw new IOException();
        }
        if (this.field2051 == null) {
            this.field2051 = new byte[this.field2048];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2051[this.field2042] = arg0[arg1 + var5];
                this.field2042 = (this.field2042 + 1) % this.field2048;
                if ((this.field2049 + this.field2045) % this.field2048 == this.field2042) {
                    throw new IOException();
                }
            }
            if (this.field2043 == null) {
                this.field2043 = this.field2038.method3260(this, 3);
            }
            this.notifyAll();
        }
    }

    public void run() {
        try {
            while (true) {
                label84: {
                    int var3;
                    int var4;
                    synchronized (this) {
                        if (this.field2045 == this.field2042) {
                            if (this.field2041) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2045;
                        if (this.field2042 >= this.field2045) {
                            var4 = this.field2042 - this.field2045;
                        } else {
                            var4 = this.field2048 - this.field2045;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2039.write(this.field2051, var3, var4);
                    } catch (IOException var12) {
                        this.field2044 = true;
                    }
                    this.field2045 = (this.field2045 + var4) % this.field2048;
                    try {
                        if (this.field2045 == this.field2042) {
                            this.field2039.flush();
                        }
                    } catch (IOException var11) {
                        this.field2044 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2046 != null) {
                        this.field2046.close();
                    }
                    if (this.field2039 != null) {
                        this.field2039.close();
                    }
                    if (this.field2040 != null) {
                        this.field2040.close();
                    }
                } catch (IOException var10) {
                }
                this.field2051 = null;
                break;
            }
        } catch (Exception var15) {
            class341.method4728((String) null, var15);
        }
    }

    @ObfuscatedName("fr.c([BIII)V")
    public void method3299(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method3323(arg0, arg1, arg2);
    }
}
