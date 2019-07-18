def choose(total,selection):
    ways = 1
    selected = 0
    while selected < selection:
        selected = selected + 1
        ways, total = ways * total//selected, total - 1
    return ways

ways = choose(5,2)
print(ways)