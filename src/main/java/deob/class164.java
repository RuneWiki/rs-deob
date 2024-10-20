package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fy")
public final class class164 extends class160 implements Runnable {

    @ObfuscatedName("fy.c")
    public InputStream field2045;

    @ObfuscatedName("fy.q")
    public OutputStream field2039;

    @ObfuscatedName("fy.m")
    public Socket field2044;

    @ObfuscatedName("fy.j")
    public boolean field2041 = false;

    @ObfuscatedName("fy.g")
    public class157 field2042;

    @ObfuscatedName("fy.i")
    public class156 field2038;

    @ObfuscatedName("fy.h")
    public byte[] field2048;

    @ObfuscatedName("fy.l")
    public int field2043 = 0;

    @ObfuscatedName("fy.d")
    public int field2046 = 0;

    @ObfuscatedName("fy.o")
    public boolean field2047 = false;

    @ObfuscatedName("fy.s")
    public final int field2040;

    @ObfuscatedName("fy.k")
    public final int field2049;

    public class164(Socket arg0, class157 arg1, int arg2) throws IOException {
        this.field2042 = arg1;
        this.field2044 = arg0;
        this.field2040 = arg2;
        this.field2049 = arg2 - 100;
        this.field2044.setSoTimeout(30000);
        this.field2044.setTcpNoDelay(true);
        this.field2044.setReceiveBufferSize(65536);
        this.field2044.setSendBufferSize(65536);
        this.field2045 = this.field2044.getInputStream();
        this.field2039 = this.field2044.getOutputStream();
    }

    @ObfuscatedName("fy.h(I)V")
    public void method3034() {
        if (this.field2041) {
            return;
        }
        synchronized (this) {
            this.field2041 = true;
            this.notifyAll();
        }
        if (this.field2038 != null) {
            while (this.field2038.field2004 == 0) {
                class194.method672(1L);
            }
            if (this.field2038.field2004 == 1) {
                try {
                    ((Thread) this.field2038.field1998).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2038 = null;
    }

    public void finalize() {
        this.method3034();
    }

    @ObfuscatedName("fy.j(I)I")
    public int method3019() throws IOException {
        return this.field2041 ? 0 : this.field2045.read();
    }

    @ObfuscatedName("fy.m(I)I")
    public int method3012() throws IOException {
        return this.field2041 ? 0 : this.field2045.available();
    }

    @ObfuscatedName("fy.q(IB)Z")
    public boolean method3010(int arg0) throws IOException {
        if (this.field2041) {
            return false;
        } else {
            return this.field2045.available() >= arg0;
        }
    }

    @ObfuscatedName("fy.g([BIII)I")
    public int method3014(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2041) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field2045.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("fy.af([BIII)V")
    public void method3052(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2041) {
            return;
        }
        if (this.field2047) {
            this.field2047 = false;
            throw new IOException();
        }
        if (this.field2048 == null) {
            this.field2048 = new byte[this.field2040];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2048[this.field2046] = arg0[arg1 + var5];
                this.field2046 = (this.field2046 + 1) % this.field2040;
                if ((this.field2049 + this.field2043) % this.field2040 == this.field2046) {
                    throw new IOException();
                }
            }
            if (this.field2038 == null) {
                this.field2038 = this.field2042.method2986(this, 3);
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
                        if (this.field2046 == this.field2043) {
                            if (this.field2041) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2043;
                        if (this.field2046 >= this.field2043) {
                            var4 = this.field2046 - this.field2043;
                        } else {
                            var4 = this.field2040 - this.field2043;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2039.write(this.field2048, var3, var4);
                    } catch (IOException var12) {
                        this.field2047 = true;
                    }
                    this.field2043 = (this.field2043 + var4) % this.field2040;
                    try {
                        if (this.field2046 == this.field2043) {
                            this.field2039.flush();
                        }
                    } catch (IOException var11) {
                        this.field2047 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2045 != null) {
                        this.field2045.close();
                    }
                    if (this.field2039 != null) {
                        this.field2039.close();
                    }
                    if (this.field2044 != null) {
                        this.field2044.close();
                    }
                } catch (IOException var10) {
                }
                this.field2048 = null;
                break;
            }
        } catch (Exception var15) {
            class155.method1451((String) null, var15);
        }
    }

    @ObfuscatedName("fy.i([BIII)V")
    public void method3013(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method3052(arg0, arg1, arg2);
    }
}
