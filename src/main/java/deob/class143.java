package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ef")
public final class class143 implements Runnable {

    @ObfuscatedName("ef.y")
    public InputStream field2168;

    @ObfuscatedName("ef.d")
    public OutputStream field2157;

    @ObfuscatedName("ef.g")
    public Socket field2166;

    @ObfuscatedName("ef.w")
    public boolean field2159 = false;

    @ObfuscatedName("ef.e")
    public class136 field2160;

    @ObfuscatedName("ef.c")
    public class146 field2161;

    @ObfuscatedName("ef.a")
    public byte[] field2162;

    @ObfuscatedName("ef.q")
    public int field2163 = 0;

    @ObfuscatedName("ef.m")
    public int field2164 = 0;

    @ObfuscatedName("ef.n")
    public boolean field2165 = false;

    public class143(Socket arg0, class136 arg1) throws IOException {
        this.field2160 = arg1;
        this.field2166 = arg0;
        this.field2166.setSoTimeout(30000);
        this.field2166.setTcpNoDelay(true);
        this.field2166.setReceiveBufferSize(16384);
        this.field2166.setSendBufferSize(16384);
        this.field2168 = this.field2166.getInputStream();
        this.field2157 = this.field2166.getOutputStream();
    }

    @ObfuscatedName("ef.d(B)V")
    public void method2794() {
        if (this.field2159) {
            return;
        }
        synchronized (this) {
            this.field2159 = true;
            this.notifyAll();
        }
        if (this.field2161 != null) {
            while (this.field2161.field2198 == 0) {
                class127.method1535(1L);
            }
            if (this.field2161.field2198 == 1) {
                try {
                    ((Thread) this.field2161.field2202).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2161 = null;
    }

    public void finalize() {
        this.method2794();
    }

    @ObfuscatedName("ef.g(B)I")
    public int method2790() throws IOException {
        return this.field2159 ? 0 : this.field2168.read();
    }

    @ObfuscatedName("ef.w(I)I")
    public int method2807() throws IOException {
        return this.field2159 ? 0 : this.field2168.available();
    }

    @ObfuscatedName("ef.e([BIIB)V")
    public void method2792(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2159) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2168.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("ef.c([BIII)V")
    public void method2789(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2159) {
            return;
        }
        if (this.field2165) {
            this.field2165 = false;
            throw new IOException();
        }
        if (this.field2162 == null) {
            this.field2162 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2162[this.field2164] = arg0[arg1 + var5];
                this.field2164 = (this.field2164 + 1) % 5000;
                if ((this.field2163 + 4900) % 5000 == this.field2164) {
                    throw new IOException();
                }
            }
            if (this.field2161 == null) {
                this.field2161 = this.field2160.method2689(this, 3);
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
                        if (this.field2164 == this.field2163) {
                            if (this.field2159) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2163;
                        if (this.field2164 >= this.field2163) {
                            var4 = this.field2164 - this.field2163;
                        } else {
                            var4 = 5000 - this.field2163;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2157.write(this.field2162, var3, var4);
                    } catch (IOException var12) {
                        this.field2165 = true;
                    }
                    this.field2163 = (this.field2163 + var4) % 5000;
                    try {
                        if (this.field2164 == this.field2163) {
                            this.field2157.flush();
                        }
                    } catch (IOException var11) {
                        this.field2165 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2168 != null) {
                        this.field2168.close();
                    }
                    if (this.field2157 != null) {
                        this.field2157.close();
                    }
                    if (this.field2166 != null) {
                        this.field2166.close();
                    }
                } catch (IOException var10) {
                }
                this.field2162 = null;
                break;
            }
        } catch (Exception var15) {
            class148.method2701((String) null, var15);
        }
    }
}
