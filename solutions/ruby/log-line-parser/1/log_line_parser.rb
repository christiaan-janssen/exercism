class LogLineParser
  def initialize(line)
    @line = line
    split_line = @line.split(": ")
    @msg = split_line[1].strip
    @lvl = split_line[0].strip.gsub(/[\[\]]/, '').downcase
  end

  def message
    @msg
  end

  def log_level
    @lvl
  end

  def reformat
    "#{@msg} (#{@lvl})"
  end
end
