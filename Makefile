.PHONY: clean-docker
clean-docker:
	docker container prune
	docker image prune