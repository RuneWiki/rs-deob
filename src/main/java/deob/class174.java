package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fm")
public final class class174 extends class170 implements Runnable {

    @ObfuscatedName("fm.g")
    public InputStream field2230;

    @ObfuscatedName("fm.e")
    public OutputStream field2221;

    @ObfuscatedName("fm.b")
    public Socket field2222;

    @ObfuscatedName("fm.z")
    public boolean field2220 = false;

    @ObfuscatedName("fm.n")
    public class167 field2224;

    @ObfuscatedName("fm.l")
    public class166 field2225;

    @ObfuscatedName("fm.s")
    public byte[] field2229;

    @ObfuscatedName("fm.y")
    public int field2227 = 0;

    @ObfuscatedName("fm.c")
    public int field2226 = 0;

    @ObfuscatedName("fm.h")
    public boolean field2223 = false;

    @ObfuscatedName("fm.i")
    public final int field2231;

    @ObfuscatedName("fm.o")
    public final int field2228;

    public class174(Socket arg0, class167 arg1, int arg2) throws IOException {
        this.field2224 = arg1;
        this.field2222 = arg0;
        this.field2231 = arg2;
        this.field2228 = arg2 - 100;
        this.field2222.setSoTimeout(30000);
        this.field2222.setTcpNoDelay(true);
        this.field2222.setReceiveBufferSize(65536);
        this.field2222.setSendBufferSize(65536);
        this.field2230 = this.field2222.getInputStream();
        this.field2221 = this.field2222.getOutputStream();
    }

    @ObfuscatedName("fm.l(I)V")
    public void method3108() {
        if (this.field2220) {
            return;
        }
        synchronized (this) {
            this.field2220 = true;
            this.notifyAll();
        }
        if (this.field2225 != null) {
            while (this.field2225.field2183 == 0) {
                class204.method48(1L);
            }
            if (this.field2225.field2183 == 1) {
                try {
                    ((Thread) this.field2225.field2182).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2225 = null;
    }

    public void finalize() {
        this.method3108();
    }

    @ObfuscatedName("fm.b(S)I")
    public int method3122() throws IOException {
        return this.field2220 ? 0 : this.field2230.read();
    }

    @ObfuscatedName("fm.e(I)I")
    public int method3104() throws IOException {
        return this.field2220 ? 0 : this.field2230.available();
    }

    @ObfuscatedName("fm.g(II)Z")
    public boolean method3103(int arg0) throws IOException {
        if (this.field2220) {
            return false;
        } else {
            return this.field2230.available() >= arg0;
        }
    }

    @ObfuscatedName("fm.z([BIII)I")
    public int method3106(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2220) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field2230.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("fm.ai([BIII)V")
    public void method3137(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2220) {
            return;
        }
        if (this.field2223) {
            this.field2223 = false;
            throw new IOException();
        }
        if (this.field2229 == null) {
            this.field2229 = new byte[this.field2231];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2229[this.field2226] = arg0[arg1 + var5];
                this.field2226 = (this.field2226 + 1) % this.field2231;
                if ((this.field2228 + this.field2227) % this.field2231 == this.field2226) {
                    throw new IOException();
                }
            }
            if (this.field2225 == null) {
                this.field2225 = this.field2224.method3080(this, 3);
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
                        if (this.field2227 == this.field2226) {
                            if (this.field2220) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2227;
                        if (this.field2226 >= this.field2227) {
                            var4 = this.field2226 - this.field2227;
                        } else {
                            var4 = this.field2231 - this.field2227;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2221.write(this.field2229, var3, var4);
                    } catch (IOException var12) {
                        this.field2223 = true;
                    }
                    this.field2227 = (this.field2227 + var4) % this.field2231;
                    try {
                        if (this.field2227 == this.field2226) {
                            this.field2221.flush();
                        }
                    } catch (IOException var11) {
                        this.field2223 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2230 != null) {
                        this.field2230.close();
                    }
                    if (this.field2221 != null) {
                        this.field2221.close();
                    }
                    if (this.field2222 != null) {
                        this.field2222.close();
                    }
                } catch (IOException var10) {
                }
                this.field2229 = null;
                break;
            }
        } catch (Exception var15) {
            class165.method4257((String) null, var15);
        }
    }

    @ObfuscatedName("fm.n([BIII)V")
    public void method3107(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method3137(arg0, arg1, arg2);
    }
}
