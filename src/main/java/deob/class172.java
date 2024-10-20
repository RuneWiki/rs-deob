package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fp")
public final class class172 extends class305 implements Runnable {

    @ObfuscatedName("fp.s")
    public InputStream field2049;

    @ObfuscatedName("fp.j")
    public OutputStream field2040;

    @ObfuscatedName("fp.i")
    public Socket field2042;

    @ObfuscatedName("fp.k")
    public boolean field2043 = false;

    @ObfuscatedName("fp.u")
    public class167 field2044;

    @ObfuscatedName("fp.n")
    public class166 field2045;

    @ObfuscatedName("fp.t")
    public byte[] field2041;

    @ObfuscatedName("fp.q")
    public int field2047 = 0;

    @ObfuscatedName("fp.x")
    public int field2046 = 0;

    @ObfuscatedName("fp.d")
    public boolean field2051 = false;

    @ObfuscatedName("fp.f")
    public final int field2050;

    @ObfuscatedName("fp.c")
    public final int field2053;

    public class172(Socket arg0, class167 arg1, int arg2) throws IOException {
        this.field2044 = arg1;
        this.field2042 = arg0;
        this.field2050 = arg2;
        this.field2053 = arg2 - 100;
        this.field2042.setSoTimeout(30000);
        this.field2042.setTcpNoDelay(true);
        this.field2042.setReceiveBufferSize(65536);
        this.field2042.setSendBufferSize(65536);
        this.field2049 = this.field2042.getInputStream();
        this.field2040 = this.field2042.getOutputStream();
    }

    @ObfuscatedName("fp.s(I)V")
    public void method3223() {
        if (this.field2043) {
            return;
        }
        synchronized (this) {
            this.field2043 = true;
            this.notifyAll();
        }
        if (this.field2045 != null) {
            while (this.field2045.field2010 == 0) {
                class298.method4739(1L);
            }
            if (this.field2045.field2010 == 1) {
                try {
                    ((Thread) this.field2045.field2014).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2045 = null;
    }

    public void finalize() {
        this.method3223();
    }

    @ObfuscatedName("fp.j(I)I")
    public int method3251() throws IOException {
        return this.field2043 ? 0 : this.field2049.read();
    }

    @ObfuscatedName("fp.i(B)I")
    public int method3244() throws IOException {
        return this.field2043 ? 0 : this.field2049.available();
    }

    @ObfuscatedName("fp.k(II)Z")
    public boolean method3226(int arg0) throws IOException {
        if (this.field2043) {
            return false;
        } else {
            return this.field2049.available() >= arg0;
        }
    }

    @ObfuscatedName("fp.u([BIIB)I")
    public int method3227(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2043) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field2049.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("fp.n([BIII)V")
    public void method3228(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2043) {
            return;
        }
        if (this.field2051) {
            this.field2051 = false;
            throw new IOException();
        }
        if (this.field2041 == null) {
            this.field2041 = new byte[this.field2050];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2041[this.field2046] = arg0[arg1 + var5];
                this.field2046 = (this.field2046 + 1) % this.field2050;
                if ((this.field2053 + this.field2047) % this.field2050 == this.field2046) {
                    throw new IOException();
                }
            }
            if (this.field2045 == null) {
                this.field2045 = this.field2044.method3192(this, 3);
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
                        if (this.field2047 == this.field2046) {
                            if (this.field2043) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2047;
                        if (this.field2046 >= this.field2047) {
                            var4 = this.field2046 - this.field2047;
                        } else {
                            var4 = this.field2050 - this.field2047;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2040.write(this.field2041, var3, var4);
                    } catch (IOException var12) {
                        this.field2051 = true;
                    }
                    this.field2047 = (this.field2047 + var4) % this.field2050;
                    try {
                        if (this.field2047 == this.field2046) {
                            this.field2040.flush();
                        }
                    } catch (IOException var11) {
                        this.field2051 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2049 != null) {
                        this.field2049.close();
                    }
                    if (this.field2040 != null) {
                        this.field2040.close();
                    }
                    if (this.field2042 != null) {
                        this.field2042.close();
                    }
                } catch (IOException var10) {
                }
                this.field2041 = null;
                break;
            }
        } catch (Exception var15) {
            class341.method40((String) null, var15);
        }
    }

    @ObfuscatedName("fp.t([BIII)V")
    public void method3229(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method3228(arg0, arg1, arg2);
    }
}
